package baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    long startTime;
    long ends;


    public long getEnds() {
        return ends;
    }


    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEnds(long ends) {
        this.ends = ends;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        ends = System.currentTimeMillis();
    }

    public long time() {
        return ends - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr=new int[10000000];
        stopWatch.start();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int) (Math.random()*10000000);
        }
        Arrays.sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.time()+"mls");
    }
}
