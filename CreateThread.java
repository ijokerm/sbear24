package lesson1;

public class CreateThread {
    public static void main(String[] args) {
    //继承Thread类
     MyThread t=new MyThread();
     t.start();
     //实现Runnable接口
     //MyRunner runner=new MyRunner();
     //Thread t2=new Thread(runner);
     //t2.start();
//java main是Java层面的主线程 和main方法中自行创建的线程是同级的
        while(true){

        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}
class MyRunner implements Runnable{
    @Override
    public void run() {
        System.out.println("in runnable");
        while(true){

        }
    }
}