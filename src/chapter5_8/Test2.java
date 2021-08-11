package chapter5_8;

public class Test2 {
    public static void main(String[] args){
        System.out.println(test1(1));
        System.out.println(test1(2));
        System.out.println(test1(3));
        System.out.println(test1(4));
        System.out.println(test1(5));
    }
    public static String test1(int number){
        String content ="";
        switch (number){
            case 1:content="春";
                break;
            case 2:content="夏";
                break;
            case 3:content="秋";
                break;
            case 4:content="冬";
                break;
            default:
                content="错误季节";

        }
        return content;

    }
}
