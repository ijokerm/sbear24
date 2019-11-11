package lesson2;

public class MyThread2  {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("明天不剁手");
            }
        });

        //不调用join时，创建线程会耗时很长，下边main方法的代码会先执行；
        //如果调用join表示thread（线程的引用）会加入
        //下边代码通常先执行，因为以上创建线程部分耗时
        System.out.println("因为没有钱");
    }
}
