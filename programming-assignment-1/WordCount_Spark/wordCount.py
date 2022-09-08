import sys
from pyspark import SparkContext
from datetime import datetime

if __name__ == "__main__":

    sc = SparkContext(appName="WordCount")

    start_time = datetime.now()

    f = sc.textFile(sys.argv[1])
    counts = f.flatMap(lambda line:line.split(" ")) \
        .map(lambda word: (word,1)) \
        .reduceByKey(lambda a,b: a+b)

    counts.saveAsTextFile(sys.argv[2])

    diff = datetime.now() - start_time
    print("Spend %d.%d seconds" % (diff.seconds, diff.microseconds))

