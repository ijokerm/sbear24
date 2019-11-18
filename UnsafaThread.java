package lesson3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentNavigableMap;

public class UnsafaThread {
    public static int COUNT;//静态变量大写，初始化其值为0
    //public static List<Integer>list;
    public static void main(String[] args) {
        //开启20个线程，每个线程对COUNT进行++操作一万次
        //预期结果20 0000
       /* Thread []threads=new Thread[20];
        for(int i=0;i<20;i++){
            threads[i]= new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10000;j++){
                        COUNT++;
                        System.out.println(COUNT);
                    }
                               }
            });
            threads[i].start();
        }*/
       List<Integer>list=new ArrayList<>();
       for(int i=0;i<20;i++){
           final int k=i;
           new Thread(new Runnable() {
               @Override
               public void run() {
                   for (int j=0;j<10000;j++){
                //       COUNT++;
                       list.add(k*1000+j);
                   }
               }
           }).start();
//           System.out.println(COUNT);
       }
       while(Thread.activeCount()>1){
           Thread.yield();
       }
        //System.out.println(COUNT);


    }
}
