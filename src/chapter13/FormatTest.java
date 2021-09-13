package chapter13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Java中对时间日其进行格式化 DateTimeFormatter 是线程安全的，SimpleDateFormat是线程不安全的，使用DateTimeFormatter
 */
public class FormatTest {
    public static void main(String[] args){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = dtf.format(ldt);
        System.out.println("格式化后的时间是 ："+time);
        // 创建指定的时间
        LocalDateTime ldt1 = LocalDateTime.of(2021,10,1,8,0,0);
        System.out.println(ldt1);
        System.out.println(dtf.format(ldt1));
        // 计算两个时间的时间差 使用Duration
        Duration dt = Duration.between(ldt,ldt1);
        System.out.println("相差的天数 ："+dt.toDays());
        System.out.println("相差的小时数 ："+dt.toHours());
        System.out.println("相差的分钟数 ："+dt.toMinutes());
        System.out.println("相差的豪秒数:"+dt.toMillis());
        System.out.println("相差的纳秒数 ："+dt.toNanos());
    }
}
