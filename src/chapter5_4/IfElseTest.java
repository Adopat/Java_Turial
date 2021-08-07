package chapter5_4;

public class IfElseTest {
    public static void main(String[] args){
        test1(9);
        System.out.println("======================");
        test2(30);
        System.out.println("======================");
        test3(2);
        System.out.println("======================");


    }
    public static void test1(int age){
        if (age>0 && age<10){
            System.out.println("年龄在10岁以内");
        }
    }
    public static void test2(int age){
        if (age>0 && age<10){
            System.out.println("年龄在10随以内");
        }else if(age>=10 && age<20){
            System.out.println("年龄在10-20之间");
        }else if (age>=20 && age<30){
            System.out.println("年龄在20-30之间");

        }else{
            System.out.println("年龄在30岁以上");
        }
    }
    public static void test3(int age){
        if (age>0 && age<10){
            System.out.println("年龄在10岁之间");
        }else{
            System.out.println("年龄大于10岁！！");
        }

    }
}
