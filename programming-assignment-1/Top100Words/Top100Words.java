import java.io.*;
import java.util.*;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class Top100Words {

    public static class top_100_Mapper extends Mapper<Object,
                            Text, Text, LongWritable> {
 
        private TreeMap<String, Long> tmap;
    
        @Override
        public void setup(Context context) throws IOException,
                                        InterruptedException
        {
            tmap = new TreeMap<String, Long>();
        }
    
        @Override
        public void map(Object key, Text value,
        Context context) throws IOException,
                        InterruptedException
        {    
            StringTokenizer itr = new StringTokenizer(value.toString());
            while (itr.hasMoreTokens()) {
                String word = itr.nextToken();
                if (tmap.containsKey(word)) {
                    tmap.put(word, tmap.get(word)+1);
                } else {
                    tmap.put(word, Long.valueOf(1));
                }
            }
        }
    
        @Override
        public void cleanup(Context context) throws IOException,
                                        InterruptedException
        {
            TreeMap<Long, String> tmap1 = new TreeMap<Long, String>();
            for (Map.Entry<String, Long> entry : tmap.entrySet()) {
                tmap1.put(entry.getValue(), entry.getKey());
                if (tmap1.size() > 100) {
                    tmap1.remove(tmap1.firstKey());
                } 
            }
            for (Map.Entry<Long, String> entry : tmap1.entrySet())
            {
    
                long count = entry.getKey();
                String name = entry.getValue();
    
                context.write(new Text(name), new LongWritable(count));
            }
        }
    }

    public static class top_100_Reducer extends Reducer<Text,
                     LongWritable, LongWritable, Text> {
 
        private TreeMap<Long, String> tmap2;
    
        @Override
        public void setup(Context context) throws IOException,
                                        InterruptedException
        {
            tmap2 = new TreeMap<Long, String>();
        }
    
        @Override
        public void reduce(Text key, Iterable<LongWritable> values,
        Context context) throws IOException, InterruptedException
        {
            String name = key.toString();
            long count = 0;
    
            for (LongWritable val : values)
            {
                count = val.get();
            }
    
            tmap2.put(count, name);
    
            if (tmap2.size() > 100)
            {
                tmap2.remove(tmap2.firstKey());
            }
        }
    
        @Override
        public void cleanup(Context context) throws IOException,
                                        InterruptedException
        {
    
            for (Map.Entry<Long, String> entry : tmap2.entrySet())
            {
    
                long count = entry.getKey();
                String name = entry.getValue();
                context.write(new LongWritable(count), new Text(name));
            }
        }
    }
 
    public static void main(String[] args) throws Exception
    {
        Configuration conf = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf,
                                  args).getRemainingArgs();

        if (otherArgs.length < 2)
        {
            System.err.println("Error: please provide two paths");
            System.exit(2);
        }
 
        long startTime = System.nanoTime();
        Job job = Job.getInstance(conf, "top 100");
        job.setJarByClass(Top100Words.class);
 
        job.setMapperClass(top_100_Mapper.class);
        job.setReducerClass(top_100_Reducer.class);
 
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);
 
        job.setOutputKeyClass(LongWritable.class);
        job.setOutputValueClass(Text.class);
 
        FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
        FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));

        boolean result = job.waitForCompletion(true);
        long stopTime = System.nanoTime();
        System.out.println("TOTAL TIME TAKEN BY THE PROGRAM: " + (stopTime - startTime));
 
        System.exit(result ? 0 : 1);
    }
}