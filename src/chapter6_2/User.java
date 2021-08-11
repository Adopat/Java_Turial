package chapter6_2;

/**
 * 一个类有多个构造函数
 */
public class User {
    private int age;
    private String name;
    public User(){
        //this("hhhhh",19);
        System.out.println("这是默认构造函数");
        this.age =120;
        this.name ="Jstin";
    }
    // 如果构造函数互相调用，要写在方法第一行
    public User(String name,int age){
        // 调用无参构造函数
        this();
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
