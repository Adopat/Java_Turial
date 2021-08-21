package chapter6_4.before;

public class Dog {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void sleep(){
        System.out.println("闭着眼睛睡觉");
    }
    public void eat(){
        System.out.println("狗吃骨头!!");
    }
}
