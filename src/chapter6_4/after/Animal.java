package chapter6_4.after;

public class Animal {
    // 父类属性不能设置为private
    protected String name;
    private  int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int  getAge(){
        return age;
    }
    public void sleep(){
        System.out.println("闭着眼睛睡觉");
    }
}
