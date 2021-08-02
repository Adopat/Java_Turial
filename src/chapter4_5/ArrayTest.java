package chapter4_5;

public class ArrayTest {
    public static void main(String[] args){
        // 定义数组的第一种方法 先定义和初始化长度
        int [] number = new int[5];
        number[0] = 1;
        number[1] = 1;
        number[2] = 1;
        number[3] = 1;
        number[4] = 1;
        System.out.println(number[4]);
        // 定义数组的第二种方法
        int [] numbers = { 2,3,4,5,6};
        System.out.println(numbers[2]);
        // 定义匿名数组
        // new int [] {1,2,3,4,5};
        // 数组要初始化才能够使用,整型数组默认值为0
        int [] numbers1 = new int[10];
        System.out.println(numbers1[9]);
        // 数组自带的属性
        System.out.println(numbers1.length);

    }
}
