package chapter4_7;

public class VariableTypeTest {
    // static 修饰的为静态变量 静态变量位类所拥有 ，所有对象共享
    public static String NAME;
    public static int AGE;
    public static  boolean FLAG;
    public static void main(String[] args){
        System.out.println(NAME); //null
        System.out.println(AGE); // 0
        System.out.println(FLAG); // false
        // 属性的调用
        Student student = new Student();
        System.out.println("=====");
        System.out.println(Student.gender);// null

        System.out.println(student.getAge()); // 0
        System.out.println(student.getName()); // null
        student.setAge(10);
        student.setName("justin");
        System.out.println(student.getAge()); // 10
        System.out.println(student.getName()); // justin
        System.out.println("==================调用静态方法====================");
        //aa();
        testStatic();


    }
    public void aa(){
        System.out.println(NAME);
        //
        System.out.println(VariableTypeTest.NAME);
        Student stu1 = new Student();
        System.out.println(stu1.gender);
    }
    public static void  testStatic(){
        System.out.println("静态方法");

    }

}
