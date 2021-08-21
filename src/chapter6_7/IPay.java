package chapter6_7;

public interface IPay {
    // static 定义静态方法
    static void staticMethos(){
        System.out.println("接口中的静态方法!!");
    }
    // default 修饰定义默认方法，默认方法不是抽象方法,可以不重写
    default void deaultMethod(){
        System.out.println("接口中的默认方法");
    }
}
