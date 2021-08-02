package chapter4_6;

import java.util.Arrays;

public class HeapStackTest {
    public static void main(String[] args){
        // 对于基本数据类型是值传递 ，会在栈中复制一份数据，对数据进行操作，不影响原先的值
        int a = 10;
        int b = a;
        b = b+10;
        System.out.println("a="+a);//10
        System.out.println("b="+b);//20
        // 对于引用数据类型，引用存放再栈中，对象具体数据存放再堆中，为了节省内存，再堆中只存放一份数据
        // 对数据进行操作会影响原先的值
        int [] numbers = {1,2,3,4,5};
        int [] numbers1 = numbers;
        numbers1[0] = 0;
        System.out.println(Arrays.toString(numbers));// [0,2,3,4,5]
        System.out.println(Arrays.toString(numbers1));// [0,2,3,4,5]
        // String 类型也是引用数据类型
        String a1 = "我在B站学习java架构课程";
        String b1 = "I love java";
        System.out.println("a1="+a1);// 我在B站学习java架构课程
        System.out.println("b1="+b1);// I love java
        b1 = a1;
        System.out.println("a1="+a1);// 我在B站学习java架构课程
        System.out.println("b1="+b1);// 我在B站学习java架构课程
        a1 = "我在腾讯学习Java,现在再学习Java基础";
        System.out.println("a1="+a1);// 我在腾讯学习Java,现在再学习Java基础
        System.out.println("b1="+b1);// 我在B站学习java架构课程


    }
}
