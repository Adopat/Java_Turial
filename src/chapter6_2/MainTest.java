package chapter6_2;

public class MainTest {
    public static void main(String[] args){
//        User user = new User();
////        user.setAge(10);
////        user.setName("justin");
//        System.out.println(user.getAge()); //120
//
//        System.out.println(user.getName()); // Jstin
        test1();
        System.out.println("================");
        test2();
        System.out.println("=======");
        sleep();
        System.out.println("===========");
        sleep("北京");
        System.out.println("===========");
        String hahaha = sleep("北京",10);
        System.out.println(hahaha);

    }

    /**
     * 调用带参的构造函数
     */
    public static void test1(){
        User user1 = new User("张三",10);
        System.out.println(user1.getAge());
        System.out.println(user1.getName());
    }

    /**
     * 调用默认的构造函数
     */
    public static void test2(){
        User user1 = new User();
        System.out.println(user1.getAge());
        System.out.println(user1.getName());
    }
    /**
     * 方法重载,方法名一样，方法的参数类型不一样，跟返回值类型无关
     */
    public static void sleep(){
        System.out.println("重载方法一");

    }
    public static void sleep(String address){
        System.out.println("重载方法二");

    }
    public static String sleep(String address,int age){
        address = address+"hahha";
        age = age+10;
        return address;


    }
}
