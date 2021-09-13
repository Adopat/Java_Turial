package chapter13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * JDK8时间日期处理类
 */
public class DateTest1 {
    public static void main(String[] args){
        // LocalDate 只返回年月日
        localDateTest();
        // LocalTime 只返回时分秒
        System.out.println("============================");
        localTimeTest();
        System.out.println("==================");
        // LocalDateTime 返回年月日 时分秒
        localDateTimeTest();
    }
    public static void localDateTest(){
        // LocalDate 类的构造函数是私有的不允许实例化，好多方法都是静态的 final修饰的类不能被继承
        LocalDate date = LocalDate.now();
        System.out.println("当前时间是 ："+date);
        // 获取当前时间 年月日
        System.out.println("当前年份:"+date.getYear());
        System.out.println("当前月份:"+date.getMonth());
        System.out.println("当前月份(数字)："+date.getMonthValue());
        System.out.println("当前天："+date.getDayOfMonth());
        System.out.println("当前星期："+date.getDayOfWeek());
        // 加减日期
        LocalDate date1 = date.plusYears(1);
        System.out.println("加减后的日期是："+date1.getYear());
        System.out.println("原始日期是: "+date.getYear());
        // 日期比较
        System.out.println("date1比date小吗？"+date1.isBefore(date));
        // 返回值为正数则代表date1比date晚
        System.out.println(date1.compareTo(date));

    }
    public static void localTimeTest(){
        LocalTime date = LocalTime.now();
        System.out.println("当前时间是 ："+date);
        System.out.println("当前小时是: "+date.getHour());
        System.out.println("当前分钟是 ："+date.getMinute());
        System.out.println("当前秒是 ："+date.getSecond());
        // 时分秒的加减
        System.out.println(date.plusHours(1).getHour());
        System.out.println(date.plusMinutes(10).getMinute());
        System.out.println(date.plusSeconds(30).getSecond());
    }
    public static void localDateTimeTest(){
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        // 获取年月日
        System.out.println("当前年 ："+date.getYear());
        System.out.println("当前月 ："+date.getMonth());
        System.out.println("当前月(数字) ："+date.getMonthValue());
        System.out.println("当前天 ："+date.getDayOfMonth());
        System.out.println("当前周几 ："+date.getDayOfWeek());
        System.out.println("当前小时 ："+date.getHour());
        System.out.println("当前分钟："+date.getMinute());
        System.out.println("当前秒 ："+date.getSecond());


    }
}
