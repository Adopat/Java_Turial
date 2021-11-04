package chapter4_3;

public class MainTest {
    // byte 8位 static 必须要加，否则再main 方法中无法调用
    static byte b = 127;
    byte c1 =100;
    // short 16位
    static short s = 32767;
    // int 32位
    static int c = 32768;
    // long 64位
    static long b4 = 121232L;
    // 单精度 32位
    static float f = 2.5F;
    // 双精度 64 位
    static double d = 2.5;
    // 1位
    static boolean bool = false;
    // 16位
    static char ch = 'A';
    public static void main(String[] args){
        MainTest mainTest = new MainTest();
        System.out.println(mainTest.c1); //100
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(b4);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(ch);
        // 记住以下ASCI码
        System.out.println("=======ASCI码=============");
        System.out.println((int)'A');// 65
        System.out.println((int)'Z');// 90
        System.out.println((int)'a');// 97
        System.out.println((int)'z');//122
        System.out.println((int)'0');//48
        System.out.println((int)' ');//75
        // 字符运算
        System.out.println("========字符运算===============");
        System.out.println('A'+'Z');//155
        System.out.println(ch+10);//75
        // 获取取值范围 使用对应的包装类
        System.out.println("===================================");
        test();
    }
    public static void test(){
        System.out.println("byte 取值范围："+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE); //byte 取值范围：-128-127
        System.out.println("short 取值范围："+Short.MIN_VALUE+"-"+Short.MAX_VALUE);// short 取值范围：-32768-32767
        System.out.println("int 取值范围："+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);// int 取值范围：-2147483648-2147483647
        System.out.println("long 取值范围："+Long.MIN_VALUE+"-"+Long.MAX_VALUE);//long 取值范围：-9223372036854775808-9223372036854775807
    }
}
