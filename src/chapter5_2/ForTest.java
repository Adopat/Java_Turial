package chapter5_2;

import java.util.Arrays;

public class ForTest {
    public static void main(String[] args){
        test1();
        System.out.println("================");
        test2();
        System.out.println("============================");
        test3();
        System.out.println("============================");
        test4();
        System.out.println("=============================");
        test5();
        System.out.println("===================================");
        test6();


    }
    // for 循环第一种写法
    public static void test1(){
        for (int i=0;i<20;i++){
            System.out.println("for循环的i ="+i);
        }
        System.out.println("for循环结束 i=");
    }
    // for 循环的第二种写法
    public static void  test2(){
        int i = 0;
        for (;i<20;i++){
            System.out.println("for 循环的i ="+i);
        }
        System.out.println("循环结束的 i="+i);
    }
    // for 循环的第三种写法
    public static void test3(){
        int i = 0;
        for(;i<20;){
            System.out.println("for循环的i ="+i);
            i++;
        }
        System.out.println("循环结束的 i ="+i);

    }
    // 增强型for 循环
    public static void test4(){
        String [] arr = {"apple","pear","banana","orange"};
        for (String str:arr){
            System.out.println(str);
        }
    }
    // 不使用增强型for 循环 使用普通方法进行遍历字符数组
    public static void test5(){
        String [] arr = {"apple","pear","banana","orange"};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    // 直接使用Arrays.toString()方法打印数组
    public static void test6(){
        String [] arr = {"apple","pear","banana","orange"};
        System.out.println(Arrays.toString(arr));
    }
}
