package chapter5_6;

public class StaitcTest {
    public static void main(String[] args){
        Student.age=10;
        Student stu1 = new Student();
        stu1.name = "小3";
        Student stu2 = new Student();
        stu2.name = "小4";
        Student stu3 = new Student();
        stu3.name = "小5";
        System.out.println(stu1.name);// 小3
        System.out.println(stu1.getAge());//10
        System.out.println(stu2.name);// 小4
        System.out.println(stu2.getAge());//10
        System.out.println(stu3.name);// 小5
        System.out.println(stu3.getAge());//10


    }
}
