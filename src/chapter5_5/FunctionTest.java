package chapter5_5;
// 函数调用的基本原理:函数调用主要是通过栈来存储相关数据的，系统就函数调用者和函数如何使用栈做了约定，返回值我们简化认为是通过一个专门的返回值存储器存储的。
/**
 * @author Adopat
 * @version 1.0
 * @description: Java 中可变参数
 * @date 2021/12/15 11:05
 */
public class FunctionTest {
    public static void main(String[] args){
        System.out.println("最大值: "+max(1,2));
        System.out.println("最大值: "+max(1,2,3,4));
        System.out.println("最大值: "+max(1,4,5,6,7,8,9));
        System.out.println("最大值: "+max(1,10,-1,2,3));
        System.out.println("最大值: "+max(1,0,1,100,1000,10000));

    }
    public static int max(int min,int ... arr){
        int max = min;
        for(int a:arr){
            if (max<a){
                max = a;
            }
        }
        return max;
    }

}
