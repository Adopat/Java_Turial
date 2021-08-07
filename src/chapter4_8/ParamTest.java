package chapter4_8;



public class ParamTest {

    public static void main(String[] args){
        ParamTest.calculateAdd(10,20);
        ParamTest.test1();
        ParamTest.test2("Justin",10);
        Student student = new Student();
        student.setAge(10);
        // 对象时引用传递 基本数据类型时值传递
        System.out.println("操作之前age ="+student.getAge());
        changeAge(student);
        System.out.println("操作之后age ="+student.getAge());
    }


    public static void calculateAdd(int numberA,int numberB){
        System.out.println("numberA="+numberA);
        System.out.println("numberB="+numberB);

    }
    public static void test1(){
        System.out.println("这个时Test1()方法！！");
    }
    public static void test2(String name,int age){
        System.out.println("name ="+name + " age="+age);
    }
    public static  void changeAge(Student student){
        student.setAge(20);
    }
    // 返回对象为引用类型
    public static Student changeAge2(Student student){
        student.setAge(20);
        return student;
    }

}
