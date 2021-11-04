package chapter4_10;

public class OperationSummary {
    public static void main(String[] args){
        // 1.赋值运算符
        int a = 10;
        // 2.算术运算符
        System.out.println(a+10);// 加
        System.out.println(a-5);// 减
        System.out.println(a*10);// 乘
        System.out.println(a/3);// 整除
        System.out.println(a%3);// 求余
        System.out.println(5.0/2);// 浮点除
        // 3.自增 自减运算
        int c =100;
        System.out.println(a++);// 10
        System.out.println(a);//11
        // 4.比较运算符
        System.out.println(a!=10); // true
        // 逻辑运算符
        // 逻辑与 && 逻辑或 || 逻辑非 !
            int b = 20;
            System.out.println(a>10 && b<20); // false
            System.out.println(a>0 && b<0); // false
            System.out.println(a>0 || b<0); // true
            System.out.println(!(a>0));// false // 这里可以看到逻辑非的运算符优先级高于 >
            // 逻辑运算符的短路运算 && 当有一个为false后面的不执行，|| 第一个为真，第二个表达式不计算
//        int i = 0;
//        int j = 0;
//        if(++i >0 || ++j>0){
//            System.out.println(i);//1
//            System.out.println(j);//0
//        }
//        int i = 0;
//        int j = 0;
//        if (i++>0||j++>0){ // 不满足条件 不执行
//            System.out.println(i);
//            System.out.println(j);
//        }
            // 三目运算 条件?成功:否则
            int age = 16;
            String content = age>18?"成年":"未成年";
            System.out.println(content);//未成年
            // Java 运算符的优先级，不用死记硬背，不确定，就加括号
           // 位运算  >> 右移  << 左移
        System.out.println(8>>2);//1000  0010
        System.out.println(10<<2);

    }
}
