package chapter4_9;

public class OperationTest {
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a%b;
        System.out.println(c); // 25
        System.out.println(d); // -5
        System.out.println(e); // 150
        System.out.println(f); // 0
        System.out.println(g); // 10
        // Java 中的自增自减运算
//        int a1 =5;
//        int b1 = a1++; // 先进行赋值运算，然后 a1进行自增,在变量左边先进行自增减操作，在进行表达式运算
//        System.out.println(a1); // 6
//        System.out.println(b1); // 5
        int a1 = 5;
        int b1 = ++a1; // 先进行a自增计算，然后将a1的值进行赋值，在变量右边，先进行表达式运算，在进行自增减操作
        System.out.println(a1); // 6
        System.out.println(b1); // 6
        // int b1 = ++a1;  等效于 a1 = a1+1 ; b1 =a1; 先进行自增计算 然后进行赋值 ，这样操作的目的是为了减少代码量
        // 基本数据类型的比较符 > < >= <= ==
        int numberA = 20;
        int numberB = 30;
        int numberC = 20;
        System.out.println(numberA>numberB); // false
        System.out.println(numberA<numberB); // true
        System.out.println(numberA>=numberC); // true
        System.out.println(numberA<=numberB); // true
        System.out.println(numberA==numberC); // true
        // 注意 == 不等用于字符串的比较,字符串是引用数据类型，引用数据类型比较的是对象在堆的内存地址，如果要比较字符串的内容应该使用equals
        System.out.println("justin"=="justin"); // true



    }
}
