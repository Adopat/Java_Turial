package chapter6_5;
// Java 继承后类的初始化顺序 静态代码块 非静态代码块 父类/子类无参构造方法 父类、子类的一般方法
public class Super1Test {
    public static void main(String[] args){
        new Children1().sleep();
    }
}
