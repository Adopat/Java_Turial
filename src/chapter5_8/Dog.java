package chapter5_8;

public class Dog {
    public static int age;
    static{
        age =10;
    }
    // 成员属性 name
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void changeAge(){
        age++;
    }
    public int getAge(){
        return  age;
    }
    public static void main(String[] args){
        Dog [] dog = new Dog[5];
        for (int i=0;i<5;i++){
            dog[i] = new Dog();
        }
        dog[3].changeAge();
        dog[3].changeAge();
        // age 是静态变量 ，在所有对象中都是共享一份
        for(int j=0;j< dog.length;j++){
            System.out.println(dog[j].getAge());
        }
    }

}
