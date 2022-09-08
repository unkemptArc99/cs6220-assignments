# Programming Assignment 1
## The Task - Option 1.1
- Install HDFS and Hadoop MapReduce on your laptop. 
- Run the word count map-reduce program, and report the runtime for two different sizes of datasets. 
- Using MapReduce to solve another problem. You may choose one of the following or create a problem yourself. 
  - Consider a dataset of 20 files, print the top 100 words occurring in the most files
  - Solving K-means clustering problem with a dataset given in Spark ML lib, R, Hadoop Mahout ML library, or Scikit-learn. 
You may use excel file to generate your runtime statistics plot or organize the performance measurement data in a tabular format. You are encouraged to learn by observing the runtime performance of Hadoop/Spark MapReduce program through different ways of programming the same problem and show their impact on the runtime performance of the MapReduce job.

## Installation
1. Visit https://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/SingleCluster.html to install the Pseudo-Distributed version for Hadoop and HDFS.
2. Add the Hadoop installation to the environment variables for easier access to the hadoop binary.
3. Test the Hadoop installation in local mode by the following grep map reduce example -
```
$ cp <hadoop_installation_dir>/etc/hadoop/*.xml test-hadoop/input
$ hadoop jar <hadoop_installation_dir>/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.3.4.jar grep test-hadoop/input test-hadoop/output 'dfs[a-z.]+'
$ cat test-hadoop/output/*
```

## Word Count 

### Dataset
I took the top 27 books from [Project Gutenberg Top 100 Ebooks](https://www.gutenberg.org/browse/scores/top), and divided them into 2 datasets.
- **Dataset 1** - I took the top 2 ebooks and replicated them 1300 times to create a dataset of 1.01 GB. My main motivation with this was to create a dataset that can fit in the memory.
- **Dataset 2** - I took the top 27 ebooks and replicated them 1600 times to create a dataset of 19.6 GB. My main intention with this dataset was to create a dataset that cannot be loaded into the memory in one swoop.

### Hadoop Map-Reduce Program
(Following the tutorial at https://hadoop.apache.org/docs/stable/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html)

1. Write the code in [the Java file](WordCount_Hadoop/WordCount.java).
   - The source code consists of 2 sub-classes of the main class `WordCount` - a Mapper (`TokenizerMapper`) and a Reducer (`IntSumReducer`).
2. Compile the code to create the .jar file for execution by the following commands -
```
$> hadoop com.sun.tools.javac.Main WordCount.java
$> jar cf wc.jar WordCount*.class
```
3. Execute the word count program. All the execution is mentioned in the [execution command file](Hadoop_WordCount_results/Hadoop_WC_execution_commands.md).
4. All the results are in [Hadoop_WordCount_results](Hadoop_WordCount_results) folder and the wordcount results/outputs are located at the following [OneDrive location]()

### Spark Map-Reduce Program
(Adapted from https://gist.github.com/qcl/dfa0fd979c18738539c8)

1. Write the code in [the Python file](WordCount_Spark/wordCount.py).
   - The source code simply consists of a map function and a reduce function coded in a functional paradigm.
2. Execute the word count program. All the execution commands is mentioned in the [execution command file](Spark_WordCount_results/Spark_WC_execution_commands.md).
3. All the results are in [Spark_WordCount_results](Spark_WordCount_results).

## Word Count Performance Results
| Dataset Size | Hadoop (Java) | Spark (Python) |
| --- | --- | --- |
| 1.01 GB | 58.59 sec | 26.11 sec |
| 19.6 GB | 891.4 sec | 336.77 sec |

