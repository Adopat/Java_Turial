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

    }
    public void aa(){
        System.out.println(NAME);
        //
        System.out.println(VariableTypeTest.NAME);
    }

}
