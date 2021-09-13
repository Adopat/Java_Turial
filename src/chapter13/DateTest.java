package chapter13;

import java.util.Date;

public class DateTest {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        System.out.println("返回时间戳："+date.getTime());
        // Date 的带参构造函数 以1970年1月日作为参考数
        Date date1 = new Date(1631532561022L);
        System.out.println(date1.toString());
    }
}
