package chapter6_5;

public class Father1 {
    static {
        System.out.println("父类静态代码块");
    }
    public Father1(){
        System.out.println("父类的无参构造方法");

    }
    public Father1(int age){
        System.out.println("父类的有参构造方法");
    }
    public void sleep(){
        System.out.println("父类的sleep方法");
    }
}
