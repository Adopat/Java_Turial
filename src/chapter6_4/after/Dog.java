package chapter6_4.after;

public class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    @Override
    public void sleep(){
        System.out.println("狗闭着眼睛睡觉");
    }
}
