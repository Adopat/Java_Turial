package chapter14;

import java.util.Arrays;
import java.util.Locale;

public class StringTest {
    public static void main(String[] args){
        // 定义字符串的方法
        String str1 = "www.baidu.com";
        String str2 = "www.baidu.com";
        String str= new String("www.baidu.com");
        String str3 = "www.baidu.com";
        // 比较字符串地址值
        System.out.println("str1和str2地址值一样吗 ："+(str1==str2));
       System.out.println("str1和str3地址值一样吗 ："+(str1==str3));
       System.out.println("str1和str地址值一样吗 ："+(str1==str));
        test();

    }
    public static void test(){
        // 定义字符串的第一种方法
        String str11 = new String("Hello World!!");
        String str22 = "Hello World!!";
        String str33 = "Hello World!!";
        // 字符串地址比较
        System.out.println(str11==str22);
        System.out.println("str2==str3?"+(str22==str33));
        System.out.println("str2==str3?"+str22==str33);
        // 字符串内容比较
        System.out.println("str11和str22的内同一样吗："+(str11.equals(str22)));
        // 字符串大小写
        String uppStr22 = str22.toUpperCase();
        System.out.println("uppStr22 ="+uppStr22);
        String lowerStr22 = str22.toLowerCase();
        System.out.println("lowerStr22="+lowerStr22);
        // 不区分大小写比较内容
        System.out.println("str11 和uppStr22的内容一样吗 :"+(str11.equalsIgnoreCase(uppStr22)));
        // 查找字符的索引位置
        int space = str11.indexOf(" ");
        System.out.println("space ="+space);
        //查找索引的字符
        char ch =str11.charAt(5);
        System.out.println("索引处的字符是 :"+(int)ch);
        // 字符串截取 注意是一个左闭右开的区间
        System.out.println(str11.substring(5));
        System.out.println(str11.substring(11,13));
        // 字符串的替换
        String replaceStr11 = str11.replace("!!","??");
        System.out.println("替换后的字符串 replaceStr11 ="+replaceStr11);
        // 字符串拆分 按照空格进行拆分
        String[] strSplit = str11.split("\\s");
        System.out.println(Arrays.toString(strSplit));
        // 字符串去除空格 ,去除前后两端的空格
        String str11Strim = " helloworld ".trim();
        System.out.println(" helloworld ".length());
        System.out.println("去除空格后的 str11Strim ="+str11Strim);
        System.out.println(str11Strim.length());


    }
}
