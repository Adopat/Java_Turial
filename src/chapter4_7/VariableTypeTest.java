package chapter4_7;

public class VariableTypeTest {
    // static 修饰的为静态变量
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

    }
    public void aa(){
        System.out.println(NAME);
        //
        System.out.println(VariableTypeTest.NAME);
        Student stu1 = new Student();
        System.out.println(stu1.gender);
    }

}
