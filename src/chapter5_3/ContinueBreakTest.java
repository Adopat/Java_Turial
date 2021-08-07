package chapter5_3;

public class ContinueBreakTest {
    public static void main(String[] args){
        test1();
        System.out.println("================");
        test2();

    }
    // break 语句 跳出整个循环
    public static void test1(){
        String [] arr = {"apple","pear","banana","orange"};
        for (int i=0;i<arr.length;i++){
            System.out.println("当前水果是: "+arr[i]);
            // 字符串比较是否相等 不能用 == 而是应该使用equals方法
            if ("banana".equals(arr[i])){
                System.out.println("发现banana了");
                break;
            }
        }
    }
    // continue 语句,跳过banana  continue 跳出本次循环，执行下一次循环
    public static void test2(){
        String [] arr = {"apple","pear","banana","orange"};
        for (String fruit:arr){

            if ("banana".equals(fruit)){
                System.out.println("发现banana了");
                continue;
            }
            System.out.println("当前水果是："+fruit);// banana 不会被打印
        }

    }
}
