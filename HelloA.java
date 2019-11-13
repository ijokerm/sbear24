package CodeBlock_kaodian;

public class HelloA {
    //构造方法
    public HelloA() {
        System.out.println("HelloA 父类构造方法");
    }
    //非静态代码块
    {
        System.out.println("i'm A class.⽗类⾮静态代码块");
    }
    //静态代码块
    static {
        System.out.println("static A ⽗类静态代码块");
    }
}


