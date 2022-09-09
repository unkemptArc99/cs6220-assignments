# Dataset 1
```
❯ hadoop jar top_100_words.jar Top100Words /user/abhishek/wordcount/problem2_input1 /user/abhishek/wordcount/problem2_output1
2022-09-08 22:56:27,812 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-08 22:56:28,175 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662672902509_0003
2022-09-08 22:56:28,390 INFO input.FileInputFormat: Total input files to process : 10
2022-09-08 22:56:28,445 INFO mapreduce.JobSubmitter: number of splits:10
2022-09-08 22:56:28,617 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662672902509_0003
2022-09-08 22:56:28,618 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-08 22:56:28,761 INFO conf.Configuration: resource-types.xml not found
2022-09-08 22:56:28,761 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-08 22:56:28,821 INFO impl.YarnClientImpl: Submitted application application_1662672902509_0003
2022-09-08 22:56:28,859 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662672902509_0003/
2022-09-08 22:56:28,860 INFO mapreduce.Job: Running job: job_1662672902509_0003
2022-09-08 22:56:33,961 INFO mapreduce.Job: Job job_1662672902509_0003 running in uber mode : false
2022-09-08 22:56:33,963 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-08 22:56:40,106 INFO mapreduce.Job:  map 60% reduce 0%
2022-09-08 22:56:43,139 INFO mapreduce.Job:  map 90% reduce 0%
2022-09-08 22:56:44,146 INFO mapreduce.Job:  map 100% reduce 0%
2022-09-08 22:56:45,156 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-08 22:56:45,173 INFO mapreduce.Job: Job job_1662672902509_0003 completed successfully
2022-09-08 22:56:45,263 INFO mapreduce.Job: Counters: 54
        File System Counters
                FILE: Number of bytes read=13927
                FILE: Number of bytes written=3063391
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=5612717
                HDFS: Number of bytes written=878
                HDFS: Number of read operations=35
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Launched map tasks=10
                Launched reduce tasks=1
                Data-local map tasks=10
                Total time spent by all maps in occupied slots (ms)=32355
                Total time spent by all reduces in occupied slots (ms)=2596
                Total time spent by all map tasks (ms)=32355
                Total time spent by all reduce tasks (ms)=2596
                Total vcore-milliseconds taken by all map tasks=32355
                Total vcore-milliseconds taken by all reduce tasks=2596
                Total megabyte-milliseconds taken by all map tasks=33131520
                Total megabyte-milliseconds taken by all reduce tasks=2658304
        Map-Reduce Framework
                Map input records=107589
                Map output records=950
                Map output bytes=12021
                Map output materialized bytes=13981
                Input split bytes=1361
                Combine input records=0
                Combine output records=0
                Reduce input groups=243
                Reduce shuffle bytes=13981
                Reduce input records=950
                Reduce output records=100
                Spilled Records=1900
                Shuffled Maps =10
                Failed Shuffles=0
                Merged Map outputs=10
                GC time elapsed (ms)=292
                CPU time spent (ms)=13320
                Physical memory (bytes) snapshot=3304738816
                Virtual memory (bytes) snapshot=30350815232
                Total committed heap usage (bytes)=2883584000
                Peak Map Physical memory (bytes)=315461632
                Peak Map Virtual memory (bytes)=2761945088
                Peak Reduce Physical memory (bytes)=246738944
                Peak Reduce Virtual memory (bytes)=2771959808
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=5611356
        File Output Format Counters 
                Bytes Written=878
TOTAL TIME TAKEN BY THE PROGRAM: 18157199597 (ns)
```
# Dataset 2
```
❯ hadoop jar top_100_words.jar Top100Words /user/abhishek/wordcount/problem2_input2 /user/abhishek/wordcount/problem2_output2
2022-09-08 22:58:09,097 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-08 22:58:09,426 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662672902509_0004
2022-09-08 22:58:09,643 INFO input.FileInputFormat: Total input files to process : 20
2022-09-08 22:58:09,702 INFO mapreduce.JobSubmitter: number of splits:20
2022-09-08 22:58:09,867 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662672902509_0004
2022-09-08 22:58:09,867 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-08 22:58:10,006 INFO conf.Configuration: resource-types.xml not found
2022-09-08 22:58:10,006 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-08 22:58:10,062 INFO impl.YarnClientImpl: Submitted application application_1662672902509_0004
2022-09-08 22:58:10,094 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662672902509_0004/
2022-09-08 22:58:10,094 INFO mapreduce.Job: Running job: job_1662672902509_0004
2022-09-08 22:58:15,180 INFO mapreduce.Job: Job job_1662672902509_0004 running in uber mode : false
2022-09-08 22:58:15,183 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-08 22:58:21,274 INFO mapreduce.Job:  map 30% reduce 0%
2022-09-08 22:58:26,316 INFO mapreduce.Job:  map 60% reduce 0%
2022-09-08 22:58:30,357 INFO mapreduce.Job:  map 85% reduce 0%
2022-09-08 22:58:33,375 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-08 22:58:34,400 INFO mapreduce.Job: Job job_1662672902509_0004 completed successfully
2022-09-08 22:58:34,485 INFO mapreduce.Job: Counters: 54
        File System Counters
                FILE: Number of bytes read=27523
                FILE: Number of bytes written=5850233
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=11137997
                HDFS: Number of bytes written=877
                HDFS: Number of read operations=65
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Launched map tasks=20
                Launched reduce tasks=1
                Data-local map tasks=20
                Total time spent by all maps in occupied slots (ms)=68032
                Total time spent by all reduces in occupied slots (ms)=7138
                Total time spent by all map tasks (ms)=68032
                Total time spent by all reduce tasks (ms)=7138
                Total vcore-milliseconds taken by all map tasks=68032
                Total vcore-milliseconds taken by all reduce tasks=7138
                Total megabyte-milliseconds taken by all map tasks=69664768
                Total megabyte-milliseconds taken by all reduce tasks=7309312
        Map-Reduce Framework
                Map input records=215019
                Map output records=1879
                Map output bytes=23759
                Map output materialized bytes=27637
                Input split bytes=2728
                Combine input records=0
                Combine output records=0
                Reduce input groups=351
                Reduce shuffle bytes=27637
                Reduce input records=1879
                Reduce output records=100
                Spilled Records=3758
                Shuffled Maps =20
                Failed Shuffles=0
                Merged Map outputs=20
                GC time elapsed (ms)=612
                CPU time spent (ms)=20220
                Physical memory (bytes) snapshot=6535340032
                Virtual memory (bytes) snapshot=57996906496
                Total committed heap usage (bytes)=5505024000
                Peak Map Physical memory (bytes)=325517312
                Peak Map Virtual memory (bytes)=2767237120
                Peak Reduce Physical memory (bytes)=235577344
                Peak Reduce Virtual memory (bytes)=2773839872
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=11135269
        File Output Format Counters 
                Bytes Written=877
TOTAL TIME TAKEN BY THE PROGRAM: 26100273711 (ns)
```
# Dataset 3
```
❯ hadoop jar top_100_words.jar Top100Words /user/abhishek/wordcount/problem2_input3 /user/abhishek/wordcount/problem2_output3
2022-09-08 22:59:53,001 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-08 22:59:53,322 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662672902509_0005
2022-09-08 22:59:53,550 INFO input.FileInputFormat: Total input files to process : 30
2022-09-08 22:59:53,605 INFO mapreduce.JobSubmitter: number of splits:30
2022-09-08 22:59:53,759 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662672902509_0005
2022-09-08 22:59:53,759 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-08 22:59:53,909 INFO conf.Configuration: resource-types.xml not found
2022-09-08 22:59:53,909 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-08 22:59:53,965 INFO impl.YarnClientImpl: Submitted application application_1662672902509_0005
2022-09-08 22:59:54,001 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662672902509_0005/
2022-09-08 22:59:54,002 INFO mapreduce.Job: Running job: job_1662672902509_0005
2022-09-08 23:00:00,079 INFO mapreduce.Job: Job job_1662672902509_0005 running in uber mode : false
2022-09-08 23:00:00,082 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-08 23:00:06,159 INFO mapreduce.Job:  map 20% reduce 0%
2022-09-08 23:00:11,198 INFO mapreduce.Job:  map 40% reduce 0%
2022-09-08 23:00:15,237 INFO mapreduce.Job:  map 53% reduce 0%
2022-09-08 23:00:16,247 INFO mapreduce.Job:  map 57% reduce 0%
2022-09-08 23:00:19,268 INFO mapreduce.Job:  map 73% reduce 0%
2022-09-08 23:00:23,306 INFO mapreduce.Job:  map 90% reduce 0%
2022-09-08 23:00:25,321 INFO mapreduce.Job:  map 90% reduce 30%
2022-09-08 23:00:27,334 INFO mapreduce.Job:  map 100% reduce 30%
2022-09-08 23:00:28,345 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-08 23:00:28,359 INFO mapreduce.Job: Job job_1662672902509_0005 completed successfully
2022-09-08 23:00:28,439 INFO mapreduce.Job: Counters: 55
        File System Counters
                FILE: Number of bytes read=41643
                FILE: Number of bytes written=8638123
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=15952760
                HDFS: Number of bytes written=885
                HDFS: Number of read operations=95
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Killed map tasks=1
                Launched map tasks=30
                Launched reduce tasks=1
                Data-local map tasks=30
                Total time spent by all maps in occupied slots (ms)=101545
                Total time spent by all reduces in occupied slots (ms)=16762
                Total time spent by all map tasks (ms)=101545
                Total time spent by all reduce tasks (ms)=16762
                Total vcore-milliseconds taken by all map tasks=101545
                Total vcore-milliseconds taken by all reduce tasks=16762
                Total megabyte-milliseconds taken by all map tasks=103982080
                Total megabyte-milliseconds taken by all reduce tasks=17164288
        Map-Reduce Framework
                Map input records=310775
                Map output records=2833
                Map output bytes=35971
                Map output materialized bytes=41817
                Input split bytes=4104
                Combine input records=0
                Combine output records=0
                Reduce input groups=480
                Reduce shuffle bytes=41817
                Reduce input records=2833
                Reduce output records=100
                Spilled Records=5666
                Shuffled Maps =30
                Failed Shuffles=0
                Merged Map outputs=30
                GC time elapsed (ms)=1089
                CPU time spent (ms)=28850
                Physical memory (bytes) snapshot=9736515584
                Virtual memory (bytes) snapshot=85613301760
                Total committed heap usage (bytes)=8126464000
                Peak Map Physical memory (bytes)=329048064
                Peak Map Virtual memory (bytes)=2768150528
                Peak Reduce Physical memory (bytes)=249810944
                Peak Reduce Virtual memory (bytes)=2763268096
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=15948656
        File Output Format Counters 
                Bytes Written=885
TOTAL TIME TAKEN BY THE PROGRAM: 36163970629 (ns)
```