package lesson2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ThreadAdvantage {
    //多线程的效率
    public static List<String>randomList(){
        char[]chars={'a','b','c','z','A','B','C','Z'};
        List<String>list=new LinkedList<>();
        for(int i=0;i<100000;i++){
            int random=new Random().nextInt(chars.length);
            char c =chars[random];
            list.add(String.valueOf(c));
        }
        return list;
    }
    public static void main(String[] args) {
      List<String>list=randomList();
      //创建十个线程每个线程获取list中的10000个元素
      //时间 java.util.Date
      //jdk1.8-->localDateTime
        long start=System.currentTimeMillis();
        Thread[] threads=new Thread[10];
        for(int i=0;i<10;i++){
            final int k=i;
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(threads[k].getName());
                    for (int j = 0; j < 10000; j++) {
                        list.get(k * 10000 + j);
                    }
                }
            },"我的线程"+k);
            threads[i].start();
            }

        /*while(Thread.activeCount()>2){

            Thread.yield();//第一种做法：让步，等子线程执行完
        }
        */
        //第二种做法：调用线程加入等待 join
        for(Thread thread:threads){
           // thread.join();
        }
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
        //平集并行的关系，可以同时执行
        //调度需要时间
        //main线程的执行时间
    }
}
