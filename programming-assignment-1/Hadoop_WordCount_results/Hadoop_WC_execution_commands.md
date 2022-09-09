# Dataset 1
```
❯ hadoop jar wc.jar WordCount /user/abhishek/wordcount/input1 /user/abhishek/wordcount/output1
2022-09-08 17:35:08,410 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-08 17:35:08,753 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.
2022-09-08 17:35:08,773 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662672902509_0001
2022-09-08 17:35:09,042 INFO input.FileInputFormat: Total input files to process : 1
2022-09-08 17:35:09,104 INFO mapreduce.JobSubmitter: number of splits:8
2022-09-08 17:35:09,258 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662672902509_0001
2022-09-08 17:35:09,258 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-08 17:35:09,404 INFO conf.Configuration: resource-types.xml not found
2022-09-08 17:35:09,404 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-08 17:35:09,644 INFO impl.YarnClientImpl: Submitted application application_1662672902509_0001
2022-09-08 17:35:09,693 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662672902509_0001/
2022-09-08 17:35:09,693 INFO mapreduce.Job: Running job: job_1662672902509_0001
2022-09-08 17:35:15,785 INFO mapreduce.Job: Job job_1662672902509_0001 running in uber mode : false
2022-09-08 17:35:15,787 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-08 17:35:32,951 INFO mapreduce.Job:  map 28% reduce 0%
2022-09-08 17:35:38,996 INFO mapreduce.Job:  map 43% reduce 0%
2022-09-08 17:35:43,035 INFO mapreduce.Job:  map 63% reduce 0%
2022-09-08 17:35:44,041 INFO mapreduce.Job:  map 69% reduce 0%
2022-09-08 17:35:45,047 INFO mapreduce.Job:  map 75% reduce 0%
2022-09-08 17:35:58,115 INFO mapreduce.Job:  map 88% reduce 0%
2022-09-08 17:36:00,125 INFO mapreduce.Job:  map 88% reduce 25%
2022-09-08 17:36:04,148 INFO mapreduce.Job:  map 96% reduce 25%
2022-09-08 17:36:05,157 INFO mapreduce.Job:  map 100% reduce 25%
2022-09-08 17:36:06,167 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-08 17:36:06,181 INFO mapreduce.Job: Job job_1662672902509_0001 completed successfully
2022-09-08 17:36:06,287 INFO mapreduce.Job: Counters: 55
        File System Counters
                FILE: Number of bytes read=13616406
                FILE: Number of bytes written=17798456
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=1082205596
                HDFS: Number of bytes written=200510
                HDFS: Number of read operations=29
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Killed map tasks=1
                Launched map tasks=9
                Launched reduce tasks=1
                Data-local map tasks=9
                Total time spent by all maps in occupied slots (ms)=200165
                Total time spent by all reduces in occupied slots (ms)=19808
                Total time spent by all map tasks (ms)=200165
                Total time spent by all reduce tasks (ms)=19808
                Total vcore-milliseconds taken by all map tasks=200165
                Total vcore-milliseconds taken by all reduce tasks=19808
                Total megabyte-milliseconds taken by all map tasks=204968960
                Total megabyte-milliseconds taken by all reduce tasks=20283392
        Map-Reduce Framework
                Map input records=19739200
                Map output records=169386100
                Map output bytes=1645792197
                Map output materialized bytes=1702056
                Input split bytes=1024
                Combine input records=170179676
                Combine output records=906944
                Reduce input groups=14171
                Reduce shuffle bytes=1702056
                Reduce input records=113368
                Reduce output records=14171
                Spilled Records=1020312
                Shuffled Maps =8
                Failed Shuffles=0
                Merged Map outputs=8
                GC time elapsed (ms)=1439
                CPU time spent (ms)=234280
                Physical memory (bytes) snapshot=3503427584
                Virtual memory (bytes) snapshot=24953290752
                Total committed heap usage (bytes)=2375024640
                Peak Map Physical memory (bytes)=429723648
                Peak Map Virtual memory (bytes)=2782429184
                Peak Reduce Physical memory (bytes)=321662976
                Peak Reduce Virtual memory (bytes)=2793062400
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=1082204572
        File Output Format Counters 
                Bytes Written=200510
TOTAL TIME TAKEN BY THE PROGRAM: 58591088481 (ns)
```
# Dataset 2

```
❯ hadoop jar wc.jar WordCount /user/abhishek/wordcount/input2 /user/abhishek/wordcount/output2
2022-09-08 17:40:39,127 INFO client.DefaultNoHARMFailoverProxyProvider: Connecting to ResourceManager at /0.0.0.0:8032
2022-09-08 17:40:39,418 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.
2022-09-08 17:40:39,434 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /tmp/hadoop-yarn/staging/abhishek/.staging/job_1662672902509_0002
2022-09-08 17:40:39,688 INFO input.FileInputFormat: Total input files to process : 1
2022-09-08 17:40:39,747 INFO mapreduce.JobSubmitter: number of splits:157
2022-09-08 17:40:39,922 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1662672902509_0002
2022-09-08 17:40:39,922 INFO mapreduce.JobSubmitter: Executing with tokens: []
2022-09-08 17:40:40,082 INFO conf.Configuration: resource-types.xml not found
2022-09-08 17:40:40,083 INFO resource.ResourceUtils: Unable to find 'resource-types.xml'.
2022-09-08 17:40:40,141 INFO impl.YarnClientImpl: Submitted application application_1662672902509_0002
2022-09-08 17:40:40,179 INFO mapreduce.Job: The url to track the job: http://abhishek-Legion-5-15ACH6:8088/proxy/application_1662672902509_0002/
2022-09-08 17:40:40,179 INFO mapreduce.Job: Running job: job_1662672902509_0002
2022-09-08 17:40:46,260 INFO mapreduce.Job: Job job_1662672902509_0002 running in uber mode : false
2022-09-08 17:40:46,263 INFO mapreduce.Job:  map 0% reduce 0%
2022-09-08 17:41:03,427 INFO mapreduce.Job:  map 1% reduce 0%
2022-09-08 17:41:09,469 INFO mapreduce.Job:  map 2% reduce 0%
2022-09-08 17:41:15,518 INFO mapreduce.Job:  map 3% reduce 0%
2022-09-08 17:41:17,548 INFO mapreduce.Job:  map 4% reduce 0%
2022-09-08 17:41:33,675 INFO mapreduce.Job:  map 5% reduce 0%
2022-09-08 17:41:39,710 INFO mapreduce.Job:  map 6% reduce 0%
2022-09-08 17:41:46,749 INFO mapreduce.Job:  map 7% reduce 0%
2022-09-08 17:41:47,757 INFO mapreduce.Job:  map 8% reduce 0%
2022-09-08 17:42:03,877 INFO mapreduce.Job:  map 9% reduce 0%
2022-09-08 17:42:09,914 INFO mapreduce.Job:  map 10% reduce 0%
2022-09-08 17:42:15,942 INFO mapreduce.Job:  map 11% reduce 0%
2022-09-08 17:42:31,036 INFO mapreduce.Job:  map 12% reduce 0%
2022-09-08 17:42:34,053 INFO mapreduce.Job:  map 13% reduce 0%
2022-09-08 17:42:43,098 INFO mapreduce.Job:  map 14% reduce 0%
2022-09-08 17:42:47,120 INFO mapreduce.Job:  map 15% reduce 0%
2022-09-08 17:43:02,205 INFO mapreduce.Job:  map 16% reduce 0%
2022-09-08 17:43:07,228 INFO mapreduce.Job:  map 17% reduce 0%
2022-09-08 17:43:16,266 INFO mapreduce.Job:  map 18% reduce 0%
2022-09-08 17:43:17,271 INFO mapreduce.Job:  map 19% reduce 0%
2022-09-08 17:43:32,335 INFO mapreduce.Job:  map 20% reduce 0%
2022-09-08 17:43:35,347 INFO mapreduce.Job:  map 20% reduce 6%
2022-09-08 17:43:38,361 INFO mapreduce.Job:  map 21% reduce 6%
2022-09-08 17:43:45,388 INFO mapreduce.Job:  map 22% reduce 6%
2022-09-08 17:43:47,396 INFO mapreduce.Job:  map 22% reduce 7%
2022-09-08 17:44:00,455 INFO mapreduce.Job:  map 23% reduce 7%
2022-09-08 17:44:06,475 INFO mapreduce.Job:  map 24% reduce 7%
2022-09-08 17:44:12,499 INFO mapreduce.Job:  map 25% reduce 7%
2022-09-08 17:44:17,521 INFO mapreduce.Job:  map 25% reduce 8%
2022-09-08 17:44:28,563 INFO mapreduce.Job:  map 26% reduce 8%
2022-09-08 17:44:29,569 INFO mapreduce.Job:  map 27% reduce 8%
2022-09-08 17:44:40,606 INFO mapreduce.Job:  map 28% reduce 8%
2022-09-08 17:44:41,610 INFO mapreduce.Job:  map 29% reduce 9%
2022-09-08 17:44:47,635 INFO mapreduce.Job:  map 29% reduce 10%
2022-09-08 17:44:57,671 INFO mapreduce.Job:  map 30% reduce 10%
2022-09-08 17:45:08,711 INFO mapreduce.Job:  map 31% reduce 10%
2022-09-08 17:45:09,714 INFO mapreduce.Job:  map 32% reduce 10%
2022-09-08 17:45:11,722 INFO mapreduce.Job:  map 32% reduce 11%
2022-09-08 17:45:24,767 INFO mapreduce.Job:  map 33% reduce 11%
2022-09-08 17:45:31,792 INFO mapreduce.Job:  map 34% reduce 11%
2022-09-08 17:45:36,807 INFO mapreduce.Job:  map 35% reduce 11%
2022-09-08 17:45:41,830 INFO mapreduce.Job:  map 35% reduce 12%
2022-09-08 17:45:51,863 INFO mapreduce.Job:  map 36% reduce 12%
2022-09-08 17:45:57,883 INFO mapreduce.Job:  map 37% reduce 12%
2022-09-08 17:46:04,907 INFO mapreduce.Job:  map 38% reduce 12%
2022-09-08 17:46:05,911 INFO mapreduce.Job:  map 38% reduce 13%
2022-09-08 17:46:19,973 INFO mapreduce.Job:  map 39% reduce 13%
2022-09-08 17:46:25,993 INFO mapreduce.Job:  map 40% reduce 13%
2022-09-08 17:46:32,013 INFO mapreduce.Job:  map 41% reduce 13%
2022-09-08 17:46:36,027 INFO mapreduce.Job:  map 41% reduce 14%
2022-09-08 17:46:47,063 INFO mapreduce.Job:  map 42% reduce 14%
2022-09-08 17:46:48,067 INFO mapreduce.Job:  map 43% reduce 14%
2022-09-08 17:46:59,099 INFO mapreduce.Job:  map 44% reduce 14%
2022-09-08 17:47:00,104 INFO mapreduce.Job:  map 45% reduce 15%
2022-09-08 17:47:15,162 INFO mapreduce.Job:  map 46% reduce 15%
2022-09-08 17:47:27,198 INFO mapreduce.Job:  map 47% reduce 15%
2022-09-08 17:47:29,206 INFO mapreduce.Job:  map 48% reduce 15%
2022-09-08 17:47:30,209 INFO mapreduce.Job:  map 48% reduce 16%
2022-09-08 17:47:44,260 INFO mapreduce.Job:  map 49% reduce 16%
2022-09-08 17:47:51,281 INFO mapreduce.Job:  map 50% reduce 16%
2022-09-08 17:47:56,296 INFO mapreduce.Job:  map 51% reduce 16%
2022-09-08 17:48:00,308 INFO mapreduce.Job:  map 51% reduce 17%
2022-09-08 17:48:12,342 INFO mapreduce.Job:  map 52% reduce 17%
2022-09-08 17:48:18,361 INFO mapreduce.Job:  map 53% reduce 17%
2022-09-08 17:48:24,379 INFO mapreduce.Job:  map 54% reduce 17%
2022-09-08 17:48:30,399 INFO mapreduce.Job:  map 54% reduce 18%
2022-09-08 17:48:39,429 INFO mapreduce.Job:  map 55% reduce 18%
2022-09-08 17:48:45,448 INFO mapreduce.Job:  map 56% reduce 18%
2022-09-08 17:48:51,466 INFO mapreduce.Job:  map 57% reduce 18%
2022-09-08 17:48:54,478 INFO mapreduce.Job:  map 57% reduce 19%
2022-09-08 17:49:06,517 INFO mapreduce.Job:  map 58% reduce 19%
2022-09-08 17:49:09,526 INFO mapreduce.Job:  map 59% reduce 19%
2022-09-08 17:49:19,557 INFO mapreduce.Job:  map 60% reduce 19%
2022-09-08 17:49:21,564 INFO mapreduce.Job:  map 61% reduce 19%
2022-09-08 17:49:24,577 INFO mapreduce.Job:  map 61% reduce 20%
2022-09-08 17:49:35,606 INFO mapreduce.Job:  map 62% reduce 20%
2022-09-08 17:49:45,636 INFO mapreduce.Job:  map 63% reduce 20%
2022-09-08 17:49:48,645 INFO mapreduce.Job:  map 64% reduce 21%
2022-09-08 17:50:02,684 INFO mapreduce.Job:  map 65% reduce 21%
2022-09-08 17:50:12,714 INFO mapreduce.Job:  map 66% reduce 21%
2022-09-08 17:50:15,726 INFO mapreduce.Job:  map 67% reduce 21%
2022-09-08 17:50:18,736 INFO mapreduce.Job:  map 67% reduce 22%
2022-09-08 17:50:31,780 INFO mapreduce.Job:  map 68% reduce 22%
2022-09-08 17:50:39,803 INFO mapreduce.Job:  map 69% reduce 22%
2022-09-08 17:50:42,814 INFO mapreduce.Job:  map 69% reduce 23%
2022-09-08 17:50:43,820 INFO mapreduce.Job:  map 70% reduce 23%
2022-09-08 17:50:58,868 INFO mapreduce.Job:  map 71% reduce 23%
2022-09-08 17:51:04,885 INFO mapreduce.Job:  map 72% reduce 23%
2022-09-08 17:51:10,904 INFO mapreduce.Job:  map 73% reduce 23%
2022-09-08 17:51:12,913 INFO mapreduce.Job:  map 73% reduce 24%
2022-09-08 17:51:25,952 INFO mapreduce.Job:  map 74% reduce 24%
2022-09-08 17:51:30,969 INFO mapreduce.Job:  map 75% reduce 24%
2022-09-08 17:51:37,989 INFO mapreduce.Job:  map 76% reduce 24%
2022-09-08 17:51:43,008 INFO mapreduce.Job:  map 76% reduce 25%
2022-09-08 17:51:53,034 INFO mapreduce.Job:  map 77% reduce 25%
2022-09-08 17:51:57,047 INFO mapreduce.Job:  map 78% reduce 25%
2022-09-08 17:52:06,071 INFO mapreduce.Job:  map 79% reduce 25%
2022-09-08 17:52:07,080 INFO mapreduce.Job:  map 79% reduce 26%
2022-09-08 17:52:10,094 INFO mapreduce.Job:  map 80% reduce 26%
2022-09-08 17:52:13,103 INFO mapreduce.Job:  map 80% reduce 27%
2022-09-08 17:52:23,135 INFO mapreduce.Job:  map 81% reduce 27%
2022-09-08 17:52:33,162 INFO mapreduce.Job:  map 82% reduce 27%
2022-09-08 17:52:34,165 INFO mapreduce.Job:  map 83% reduce 27%
2022-09-08 17:52:43,189 INFO mapreduce.Job:  map 83% reduce 28%
2022-09-08 17:52:49,207 INFO mapreduce.Job:  map 84% reduce 28%
2022-09-08 17:52:56,227 INFO mapreduce.Job:  map 85% reduce 28%
2022-09-08 17:53:01,242 INFO mapreduce.Job:  map 86% reduce 28%
2022-09-08 17:53:07,263 INFO mapreduce.Job:  map 86% reduce 29%
2022-09-08 17:53:16,287 INFO mapreduce.Job:  map 87% reduce 29%
2022-09-08 17:53:22,307 INFO mapreduce.Job:  map 88% reduce 29%
2022-09-08 17:53:28,322 INFO mapreduce.Job:  map 89% reduce 29%
2022-09-08 17:53:31,331 INFO mapreduce.Job:  map 89% reduce 30%
2022-09-08 17:53:42,361 INFO mapreduce.Job:  map 90% reduce 30%
2022-09-08 17:53:48,379 INFO mapreduce.Job:  map 91% reduce 30%
2022-09-08 17:53:54,395 INFO mapreduce.Job:  map 92% reduce 30%
2022-09-08 17:54:01,417 INFO mapreduce.Job:  map 92% reduce 31%
2022-09-08 17:54:09,443 INFO mapreduce.Job:  map 93% reduce 31%
2022-09-08 17:54:15,461 INFO mapreduce.Job:  map 94% reduce 31%
2022-09-08 17:54:23,482 INFO mapreduce.Job:  map 95% reduce 31%
2022-09-08 17:54:28,503 INFO mapreduce.Job:  map 96% reduce 31%
2022-09-08 17:54:31,512 INFO mapreduce.Job:  map 96% reduce 32%
2022-09-08 17:54:43,548 INFO mapreduce.Job:  map 97% reduce 32%
2022-09-08 17:54:52,574 INFO mapreduce.Job:  map 98% reduce 32%
2022-09-08 17:54:55,586 INFO mapreduce.Job:  map 99% reduce 33%
2022-09-08 17:55:09,621 INFO mapreduce.Job:  map 100% reduce 33%
2022-09-08 17:55:19,646 INFO mapreduce.Job:  map 100% reduce 45%
2022-09-08 17:55:25,660 INFO mapreduce.Job:  map 100% reduce 70%
2022-09-08 17:55:29,671 INFO mapreduce.Job:  map 100% reduce 100%
2022-09-08 17:55:29,676 INFO mapreduce.Job: Job job_1662672902509_0002 completed successfully
2022-09-08 17:55:29,791 INFO mapreduce.Job: Counters: 55
        File System Counters
                FILE: Number of bytes read=2925833410
                FILE: Number of bytes written=3332704582
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=21015321472
                HDFS: Number of bytes written=2190397
                HDFS: Number of read operations=476
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
                HDFS: Number of bytes read erasure-coded=0
        Job Counters 
                Killed map tasks=1
                Launched map tasks=158
                Launched reduce tasks=1
                Data-local map tasks=158
                Total time spent by all maps in occupied slots (ms)=4292218
                Total time spent by all reduces in occupied slots (ms)=729572
                Total time spent by all map tasks (ms)=4292218
                Total time spent by all reduce tasks (ms)=729572
                Total vcore-milliseconds taken by all map tasks=4292218
                Total vcore-milliseconds taken by all reduce tasks=729572
                Total megabyte-milliseconds taken by all map tasks=4395231232
                Total megabyte-milliseconds taken by all reduce tasks=747081728
        Map-Reduce Framework
                Map input records=412534400
                Map output records=3592980800
                Map output bytes=34686156797
                Map output materialized bytes=363332069
                Input split bytes=20096
                Combine input records=3757791566
                Combine output records=188159021
                Reduce input groups=148715
                Reduce shuffle bytes=363332069
                Reduce input records=23348255
                Reduce output records=148715
                Spilled Records=211507276
                Shuffled Maps =157
                Failed Shuffles=0
                Merged Map outputs=157
                GC time elapsed (ms)=24088
                CPU time spent (ms)=5006300
                Physical memory (bytes) snapshot=64055099392
                Virtual memory (bytes) snapshot=437867335680
                Total committed heap usage (bytes)=41964011520
                Peak Map Physical memory (bytes)=437071872
                Peak Map Virtual memory (bytes)=2784141312
                Peak Reduce Physical memory (bytes)=644440064
                Peak Reduce Virtual memory (bytes)=2794840064
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=21015301376
        File Output Format Counters 
                Bytes Written=2190397
TOTAL TIME TAKEN BY THE PROGRAM: 891408258973 (ns)
```