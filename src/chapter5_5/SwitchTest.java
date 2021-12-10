package chapter5_5;
// 再多条件的情况下，应该使用 swtich case 提高效率 ，条件执行的本质 是依赖月条件跳转，无条件跳转，跳转表
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
        System.out.println("===========swtich 穿透测试 test2() 运行===========================");
        test2(1);
        System.out.println("===========switch 堆叠==================");
        test3(3);

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
    // switch 记得每个case 带break ,否则会引起 switch 穿透 输出 1，2，3
    public static void test2(int day){
        switch(day){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("3");
        }
    }
    // case 堆叠
    public static void test3(int day){
        switch (day){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println(day);
                break;
            case 4:
            case 5:
        }
    }
}
