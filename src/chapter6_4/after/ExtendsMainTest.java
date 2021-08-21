package chapter6_4.after;

public class ExtendsMainTest {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("justin");
        String name = dog.getName();
        System.out.println(name);
        // age 为private 修饰符 通过getAge()调用
        System.out.println(dog.getAge());

        dog.sleep();
        System.out.println("==============");
        Cat cat = new Cat();
        cat.setName("看看看看");
        System.out.println(cat.getName());
        System.out.println("============");
        cat.eat();
        dog.eat();
        System.out.println("======");

        dog.sleep();
        cat.sleep();
    }
}
