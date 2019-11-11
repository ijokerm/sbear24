package lesson2;

public class StopThread {
    public static volatile boolean myInterrupted=true;
    public static void main(String[] args)throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(myInterrupted){
                    System.out.println("hi hi");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            }
        }).start();
        Thread.sleep(5000);
        myInterrupted=true;
    }
}
