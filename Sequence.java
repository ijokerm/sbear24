package lesson1;

public class Sequence {
    public static void main(String[] args) {
       //不管是否使用了Runnable都要用到thread

        //启动0-9编号的十个线程，每个线程打印他的编号

    for(int i=0;i<10;i++){
        final int j=i;
        Runnable r=new Runnable() {
            @Override
            public void run() {

                System.out.println(j);
            }
        };
        Thread t=new Thread(r);
        t.run();
        }
    }
}


