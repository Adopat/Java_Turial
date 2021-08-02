package chapter4_2;

public class Father {
    // 方法修饰符为Public 可以再不同包的非子类进行调用
    public void test(){
        System.out.println("我是Father类的test方法！！");
    }
    // 方法修饰符为protected ,可以再不同包的子类进行调用
    protected void test1(){
        System.out.println("我是Father类的test方法！！");
    }
}
