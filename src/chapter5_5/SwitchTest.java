package chapter5_5;

public class SwitchTest {
    public static void main(String[] args){
        int day = 1;
        String content="";
        switch (day){
            case 1 :content="周一";
            break;
            case 2:content="周二";
            break;
            case 3:content="周三";
            break;
            case 4:content="周四";
            break;
            case 5:content="周五";
            break;
            default:
                System.out.println("无效数字");

        }
        System.out.println(content);
        test1("周一");

    }
    // 在JDK7后 switch 中可以使用字符串
    public static void test1(String day){
        int dayNumber = 0;
        switch (day){
            case "周一":dayNumber=1;
            break;
            case "周二":dayNumber=2;
            break;
            case "周三":dayNumber=3;
            break;
            case "周四":dayNumber=4;
            break;
            case "周五":dayNumber=5;
            break;
            default:
                System.out.println("无效日期！！！");
        }
        System.out.println("今天是星期 "+dayNumber);
    }
}
