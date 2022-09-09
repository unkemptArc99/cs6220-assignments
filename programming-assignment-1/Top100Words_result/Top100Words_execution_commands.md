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
# Dataset 4
```
❯ hadoop jar top_100_words.jar Top100Words /user/abhishek/wordcount/problem2_input4 /user/abhishek/wordcount/problem2_output4
2022-09-09 18:19:02,400 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-09 18:19:02,723 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662761425839_0001
2022-09-09 18:19:02,982 INFO input.FileInputFormat: Total input files to process : 40
2022-09-09 18:19:03,049 INFO mapreduce.JobSubmitter: number of splits:40
2022-09-09 18:19:03,221 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662761425839_0001
2022-09-09 18:19:03,221 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-09 18:19:03,365 INFO conf.Configuration: resource-types.xml not found
2022-09-09 18:19:03,365 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-09 18:19:03,748 INFO impl.YarnClientImpl: Submitted application application_1662761425839_0001
2022-09-09 18:19:03,786 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662761425839_0001/
2022-09-09 18:19:03,787 INFO mapreduce.Job: Running job: job_1662761425839_0001
2022-09-09 18:19:09,868 INFO mapreduce.Job: Job job_1662761425839_0001 running in uber mode : false
2022-09-09 18:19:09,870 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-09 18:19:15,953 INFO mapreduce.Job:  map 15% reduce 0%
2022-09-09 18:19:20,989 INFO mapreduce.Job:  map 30% reduce 0%
2022-09-09 18:19:26,029 INFO mapreduce.Job:  map 45% reduce 0%
2022-09-09 18:19:29,051 INFO mapreduce.Job:  map 47% reduce 0%
2022-09-09 18:19:30,060 INFO mapreduce.Job:  map 50% reduce 0%
2022-09-09 18:19:31,069 INFO mapreduce.Job:  map 57% reduce 0%
2022-09-09 18:19:33,082 INFO mapreduce.Job:  map 60% reduce 0%
2022-09-09 18:19:34,087 INFO mapreduce.Job:  map 70% reduce 0%
2022-09-09 18:19:37,114 INFO mapreduce.Job:  map 73% reduce 0%
2022-09-09 18:19:38,120 INFO mapreduce.Job:  map 82% reduce 0%
2022-09-09 18:19:41,138 INFO mapreduce.Job:  map 85% reduce 28%
2022-09-09 18:19:42,145 INFO mapreduce.Job:  map 95% reduce 28%
2022-09-09 18:19:45,160 INFO mapreduce.Job:  map 100% reduce 28%
2022-09-09 18:19:46,171 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-09 18:19:46,187 INFO mapreduce.Job: Job job_1662761425839_0001 completed successfully
2022-09-09 18:19:46,266 INFO mapreduce.Job: Counters: 54
        File System Counters
                FILE: Number of bytes read=55564
                FILE: Number of bytes written=11425615
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=21565547
                HDFS: Number of bytes written=887
                HDFS: Number of read operations=125
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Launched map tasks=40
                Launched reduce tasks=1
                Data-local map tasks=40
                Total time spent by all maps in occupied slots (ms)=134673
                Total time spent by all reduces in occupied slots (ms)=19983
                Total time spent by all map tasks (ms)=134673
                Total time spent by all reduce tasks (ms)=19983
                Total vcore-milliseconds taken by all map tasks=134673
                Total vcore-milliseconds taken by all reduce tasks=19983
                Total megabyte-milliseconds taken by all map tasks=137905152
                Total megabyte-milliseconds taken by all reduce tasks=20462592
        Map-Reduce Framework
                Map input records=418364
                Map output records=3783
                Map output bytes=47992
                Map output materialized bytes=55798
                Input split bytes=5535
                Combine input records=0
                Combine output records=0
                Reduce input groups=480
                Reduce shuffle bytes=55798
                Reduce input records=3783
                Reduce output records=100
                Spilled Records=7566
                Shuffled Maps =40
                Failed Shuffles=0
                Merged Map outputs=40
                GC time elapsed (ms)=1313
                CPU time spent (ms)=40780
                Physical memory (bytes) snapshot=12938670080
                Virtual memory (bytes) snapshot=113241513984
                Total committed heap usage (bytes)=10747904000
                Peak Map Physical memory (bytes)=328351744
                Peak Map Virtual memory (bytes)=2768707584
                Peak Reduce Physical memory (bytes)=240861184
                Peak Reduce Virtual memory (bytes)=2762313728
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=21560012
        File Output Format Counters 
                Bytes Written=887
TOTAL TIME TAKEN BY THE PROGRAM: 44497862550(ns)
```
# Dataset 5
```
❯ hadoop jar top_100_words.jar Top100Words /user/abhishek/wordcount/problem2_input5 /user/abhishek/wordcount/problem2_output5
2022-09-09 18:21:23,440 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-09 18:21:23,736 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662761425839_0002
2022-09-09 18:21:23,977 INFO input.FileInputFormat: Total input files to process : 50
2022-09-09 18:21:24,035 INFO mapreduce.JobSubmitter: number of splits:50
2022-09-09 18:21:24,193 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662761425839_0002
2022-09-09 18:21:24,193 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-09 18:21:24,335 INFO conf.Configuration: resource-types.xml not found
2022-09-09 18:21:24,335 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-09 18:21:24,394 INFO impl.YarnClientImpl: Submitted application application_1662761425839_0002
2022-09-09 18:21:24,434 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662761425839_0002/
2022-09-09 18:21:24,434 INFO mapreduce.Job: Running job: job_1662761425839_0002
2022-09-09 18:21:29,523 INFO mapreduce.Job: Job job_1662761425839_0002 running in uber mode : false
2022-09-09 18:21:29,525 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-09 18:21:35,624 INFO mapreduce.Job:  map 12% reduce 0%
2022-09-09 18:21:40,680 INFO mapreduce.Job:  map 24% reduce 0%
2022-09-09 18:21:45,727 INFO mapreduce.Job:  map 36% reduce 0%
2022-09-09 18:21:49,762 INFO mapreduce.Job:  map 42% reduce 0%
2022-09-09 18:21:50,770 INFO mapreduce.Job:  map 46% reduce 0%
2022-09-09 18:21:53,789 INFO mapreduce.Job:  map 52% reduce 0%
2022-09-09 18:21:54,801 INFO mapreduce.Job:  map 56% reduce 0%
2022-09-09 18:21:57,821 INFO mapreduce.Job:  map 62% reduce 0%
2022-09-09 18:21:58,829 INFO mapreduce.Job:  map 66% reduce 0%
2022-09-09 18:22:01,849 INFO mapreduce.Job:  map 72% reduce 22%
2022-09-09 18:22:02,858 INFO mapreduce.Job:  map 76% reduce 22%
2022-09-09 18:22:05,875 INFO mapreduce.Job:  map 82% reduce 22%
2022-09-09 18:22:06,882 INFO mapreduce.Job:  map 86% reduce 22%
2022-09-09 18:22:07,889 INFO mapreduce.Job:  map 86% reduce 29%
2022-09-09 18:22:09,900 INFO mapreduce.Job:  map 92% reduce 29%
2022-09-09 18:22:10,907 INFO mapreduce.Job:  map 96% reduce 29%
2022-09-09 18:22:12,924 INFO mapreduce.Job:  map 100% reduce 29%
2022-09-09 18:22:13,931 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-09 18:22:14,952 INFO mapreduce.Job: Job job_1662761425839_0002 completed successfully
2022-09-09 18:22:15,030 INFO mapreduce.Job: Counters: 54
        File System Counters
                FILE: Number of bytes read=69160
                FILE: Number of bytes written=14212457
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=27090897
                HDFS: Number of bytes written=893
                HDFS: Number of read operations=155
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Launched map tasks=50
                Launched reduce tasks=1
                Data-local map tasks=50
                Total time spent by all maps in occupied slots (ms)=166825
                Total time spent by all reduces in occupied slots (ms)=27562
                Total time spent by all map tasks (ms)=166825
                Total time spent by all reduce tasks (ms)=27562
                Total vcore-milliseconds taken by all map tasks=166825
                Total vcore-milliseconds taken by all reduce tasks=27562
                Total megabyte-milliseconds taken by all map tasks=170828800
                Total megabyte-milliseconds taken by all reduce tasks=28223488
        Map-Reduce Framework
                Map input records=525794
                Map output records=4712
                Map output bytes=59730
                Map output materialized bytes=69454
                Input split bytes=6972
                Combine input records=0
                Combine output records=0
                Reduce input groups=480
                Reduce shuffle bytes=69454
                Reduce input records=4712
                Reduce output records=100
                Spilled Records=9424
                Shuffled Maps =50
                Failed Shuffles=0
                Merged Map outputs=50
                GC time elapsed (ms)=1843
                CPU time spent (ms)=54810
                Physical memory (bytes) snapshot=16103706624
                Virtual memory (bytes) snapshot=140930899968
                Total committed heap usage (bytes)=13369344000
                Peak Map Physical memory (bytes)=330223616
                Peak Map Virtual memory (bytes)=2772324352
                Peak Reduce Physical memory (bytes)=289800192
                Peak Reduce Virtual memory (bytes)=2774368256
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=27083925
        File Output Format Counters 
                Bytes Written=893
TOTAL TIME TAKEN BY THE PROGRAM: 52242149563(ns)
```
# Dataset 6
```
❯ hadoop jar top_100_words.jar Top100Words /user/abhishek/wordcount/problem2_input6 /user/abhishek/wordcount/problem2_output6
2022-09-09 18:22:52,514 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-09 18:22:52,809 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662761425839_0003
2022-09-09 18:22:53,030 INFO input.FileInputFormat: Total input files to process : 60
2022-09-09 18:22:53,098 INFO mapreduce.JobSubmitter: number of splits:60
2022-09-09 18:22:53,249 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662761425839_0003
2022-09-09 18:22:53,249 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-09 18:22:53,396 INFO conf.Configuration: resource-types.xml not found
2022-09-09 18:22:53,396 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-09 18:22:53,462 INFO impl.YarnClientImpl: Submitted application application_1662761425839_0003
2022-09-09 18:22:53,501 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662761425839_0003/
2022-09-09 18:22:53,501 INFO mapreduce.Job: Running job: job_1662761425839_0003
2022-09-09 18:22:58,570 INFO mapreduce.Job: Job job_1662761425839_0003 running in uber mode : false
2022-09-09 18:22:58,573 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-09 18:23:04,657 INFO mapreduce.Job:  map 10% reduce 0%
2022-09-09 18:23:09,710 INFO mapreduce.Job:  map 20% reduce 0%
2022-09-09 18:23:14,746 INFO mapreduce.Job:  map 30% reduce 0%
2022-09-09 18:23:19,786 INFO mapreduce.Job:  map 38% reduce 0%
2022-09-09 18:23:22,810 INFO mapreduce.Job:  map 42% reduce 0%
2022-09-09 18:23:23,819 INFO mapreduce.Job:  map 47% reduce 0%
2022-09-09 18:23:26,840 INFO mapreduce.Job:  map 52% reduce 0%
2022-09-09 18:23:27,847 INFO mapreduce.Job:  map 55% reduce 0%
2022-09-09 18:23:28,854 INFO mapreduce.Job:  map 55% reduce 18%
2022-09-09 18:23:30,865 INFO mapreduce.Job:  map 62% reduce 18%
2022-09-09 18:23:31,871 INFO mapreduce.Job:  map 63% reduce 18%
2022-09-09 18:23:34,887 INFO mapreduce.Job:  map 70% reduce 21%
2022-09-09 18:23:35,893 INFO mapreduce.Job:  map 72% reduce 21%
2022-09-09 18:23:38,912 INFO mapreduce.Job:  map 78% reduce 21%
2022-09-09 18:23:39,920 INFO mapreduce.Job:  map 80% reduce 21%
2022-09-09 18:23:40,925 INFO mapreduce.Job:  map 80% reduce 27%
2022-09-09 18:23:42,938 INFO mapreduce.Job:  map 87% reduce 27%
2022-09-09 18:23:43,943 INFO mapreduce.Job:  map 88% reduce 27%
2022-09-09 18:23:46,965 INFO mapreduce.Job:  map 95% reduce 29%
2022-09-09 18:23:47,970 INFO mapreduce.Job:  map 97% reduce 29%
2022-09-09 18:23:50,989 INFO mapreduce.Job:  map 100% reduce 29%
2022-09-09 18:23:51,999 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-09 18:23:52,015 INFO mapreduce.Job: Job job_1662761425839_0003 completed successfully
2022-09-09 18:23:52,096 INFO mapreduce.Job: Counters: 54
        File System Counters
                FILE: Number of bytes read=83280
                FILE: Number of bytes written=17000347
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=31905730
                HDFS: Number of bytes written=888
                HDFS: Number of read operations=185
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Launched map tasks=60
                Launched reduce tasks=1
                Data-local map tasks=60
                Total time spent by all maps in occupied slots (ms)=202182
                Total time spent by all reduces in occupied slots (ms)=36842
                Total time spent by all map tasks (ms)=202182
                Total time spent by all reduce tasks (ms)=36842
                Total vcore-milliseconds taken by all map tasks=202182
                Total vcore-milliseconds taken by all reduce tasks=36842
                Total megabyte-milliseconds taken by all map tasks=207034368
                Total megabyte-milliseconds taken by all reduce tasks=37726208
        Map-Reduce Framework
                Map input records=621550
                Map output records=5666
                Map output bytes=71942
                Map output materialized bytes=83634
                Input split bytes=8418
                Combine input records=0
                Combine output records=0
                Reduce input groups=480
                Reduce shuffle bytes=83634
                Reduce input records=5666
                Reduce output records=100
                Spilled Records=11332
                Shuffled Maps =60
                Failed Shuffles=0
                Merged Map outputs=60
                GC time elapsed (ms)=2028
                CPU time spent (ms)=63470
                Physical memory (bytes) snapshot=19235368960
                Virtual memory (bytes) snapshot=168490852352
                Total committed heap usage (bytes)=15990784000
                Peak Map Physical memory (bytes)=328011776
                Peak Map Virtual memory (bytes)=2769526784
                Peak Reduce Physical memory (bytes)=301805568
                Peak Reduce Virtual memory (bytes)=2768580608
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=31897312
        File Output Format Counters 
                Bytes Written=888
TOTAL TIME TAKEN BY THE PROGRAM: 60217939370(ns)
```