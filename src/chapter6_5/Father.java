package chapter6_5;

public class Father {
    public Father(){
        System.out.println("father 无参构造函数");
    }
    public Father(int age){
        System.out.println("father 有参构造函数");
    }
    public void sleep(){
        System.out.println("父类的睡觉方法!!!");
    }
}
