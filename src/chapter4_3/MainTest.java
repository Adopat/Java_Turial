package chapter4_3;

import java.io.UnsupportedEncodingException;

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
    public static void main(String[] args) throws Exception{
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
        // 进制转化
        System.out.println("===========进制转化========================");
        test1();
        // 字符乱码解决方案
        System.out.println("=============字符乱码解决方案=====================");
        recover("鎻掑叆 / 鏇存柊");
        String testString = "鎻掑叆 / 鏇存柊";
        // getBytes() 解码 new String() 编码
        String resultString = new String(testString.getBytes("GB18030"),"utf-8");
        System.out.println("resultString= "+resultString);
        System.out.println("===============================char================");
        testChar();
    }
    public static void test(){
        System.out.println("byte 取值范围："+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE); //byte 取值范围：-128-127
        System.out.println("short 取值范围："+Short.MIN_VALUE+"-"+Short.MAX_VALUE);// short 取值范围：-32768-32767
        System.out.println("int 取值范围："+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);// int 取值范围：-2147483648-2147483647
        System.out.println("long 取值范围："+Long.MIN_VALUE+"-"+Long.MAX_VALUE);//long 取值范围：-9223372036854775808-9223372036854775807
    }
    // 查看整数的二进制和十六进制 使用 Integer 和 Long 的方法 进行进制转化
    public static void test1(){
        int a = 10;
        System.out.println("10进制转二进制 ："+Integer.toBinaryString(a));
        System.out.println("10进制转16进制： "+Integer.toHexString(a));
        System.out.println("10进制转二进制 ："+Long.toBinaryString(a));
        System.out.println("10进制转16进制： "+Integer.toHexString(a));

    }
    // 解决字符编码
    public static void recover(String str) throws UnsupportedEncodingException {
        String[] charsets = new String[]{"windows-1252","GB18030","Big5","UTF-8"};
        for(int i=0;i<charsets.length;i++){
            for(int j=0;j<charsets.length;j++){
                if(i!=j){
                    String s = new String(str.getBytes(charsets[i]),charsets[j]);
                    System.out.println("---- 原来编码(A)假设是: "+charsets[j]+", 被错误解读为了(B): "+charsets[i]);
                    System.out.println(s);
                    System.out.println();
                }
            }
        }
    }
    // char 的本质是一个固定占用两个字节的无符号正整数,这个正整数对应Unicode编号
    public static void testChar(){
        char a = 'A';
        int c = (a+32);
        System.out.println("c= "+(char)c);
        char d = 65;
        System.out.println("d= "+d);
        byte b = 127;
        // 出现-128的原因是因为 128超过了byte 的表示范围 当计算结果超出表示范围的时候，最高位往往是1，然后就会被看做负数。比如说，127+1：
        // 1111111 + 0000001 = 10000000 最高位为1 当成负数看待了
        // 负数采用 补码表示   原码取反+1 = 补码
        byte bb = (byte)(127 + 1);
        System.out.println("bb="+bb);

    }
}
