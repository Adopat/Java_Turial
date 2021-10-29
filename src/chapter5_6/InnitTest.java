package chapter5_6;

/**
 * 调用顺序 静态属性>静态方法块>普通属性初始化>普通方法初始化>构造函数初始化
 */
public class InnitTest {
    // 静态属性
    private static String staticField= getStaticField();
    // 静态方法块
    static {
        System.out.println(staticField);
        System.out.println("静态方法块初始化");
    }
    // 普通属性
    private String field = getField();
    // 普通方法块
    {

        System.out.println("普通方法块"+field);
    }
    // 构造函数
    public InnitTest(){
        System.out.println("构造函数初始化");
    }
    public static String getStaticField(){
        String field = "静态属性Field Initial";
        return field;
    }
    public static String getField(){
        String field = "普通属性Field Initial";
        return field;
    }
    public static void main(String[] args){
        new InnitTest();
    }
}


