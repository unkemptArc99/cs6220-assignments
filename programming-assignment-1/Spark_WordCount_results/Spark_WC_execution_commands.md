# Dataset 1
```
❯ python wordCount.py hdfs://localhost:9000/user/abhishek/wordcount/input1 hdfs://localhost:9000/user/abhishek/wordcount/output1_spark
22/09/08 18:24:59 WARN Utils: Your hostname, abhishek-Legion-5-15ACH6 resolves to a loopback address: 127.0.1.1; using 10.2.105.41 instead (on interface wlp4s0)
22/09/08 18:24:59 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.apache.spark.unsafe.Platform (file:/home/abhishek/anaconda3/envs/cs6220/lib/python3.10/site-packages/pyspark/jars/spark-unsafe_2.12-3.1.2.jar) to constructor java.nio.DirectByteBuffer(long,int)
WARNING: Please consider reporting this to the maintainers of org.apache.spark.unsafe.Platform
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
22/09/08 18:25:00 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
Setting default log level to "WARN".
To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
Spend 26.119549 seconds 
```
# Dataset 2
```
❯ python wordCount.py hdfs://localhost:9000/user/abhishek/wordcount/input2 hdfs://localhost:9000/user/abhishek/wordcount/output2_spark
22/09/08 18:27:18 WARN Utils: Your hostname, abhishek-Legion-5-15ACH6 resolves to a loopback address: 127.0.1.1; using 10.2.105.41 instead (on interface wlp4s0)
22/09/08 18:27:18 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.apache.spark.unsafe.Platform (file:/home/abhishek/anaconda3/envs/cs6220/lib/python3.10/site-packages/pyspark/jars/spark-unsafe_2.12-3.1.2.jar) to constructor java.nio.DirectByteBuffer(long,int)
WARNING: Please consider reporting this to the maintainers of org.apache.spark.unsafe.Platform
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
22/09/08 18:27:19 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
Setting default log level to "WARN".
To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
Spend 336.777714 seconds 
```