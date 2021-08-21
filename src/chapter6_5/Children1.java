package chapter6_5;

public class Children1 extends Father1 {
    static {
        System.out.println("子类的静态代码块");
    }
    public Children1(){
        System.out.println("子类的无参构造方法");
        super.sleep();
    }
    public void sleep(){
        System.out.println("子类的sleep方法");
    }
}
