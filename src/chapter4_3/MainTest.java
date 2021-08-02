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
    }
}
