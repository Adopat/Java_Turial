package chapter6_5;

public class Children extends Father{
    public Children(){
        // 默认存在，写不写都可以 子类继承父类 默认会调用父类的无参构造函数，如果父类重写了构造函数，而不显示的
        // 表达无参构造函数，则会报错
        //super();
        System.out.println("子类的无参构造方法");
    }
    public void sleep(){
        // 调用父类的sleep()方法
        super.sleep();
        System.out.println("子类的睡觉方法!!");
    }
    public void test(){
        System.out.println("test方法开始执行");
        super.sleep();
        sleep();
        System.out.println("test方法结束执行!!");
    }
}
