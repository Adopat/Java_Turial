package chapter6_8;

public class Student implements Person{
    @Override
    public void talk(){
        System.out.println("学生在讲话");
    }
    public void run(){
        System.out.println("学生再跑");
    }
}
