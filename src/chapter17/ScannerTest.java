package chapter17;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入一行字符串");
            String str = scanner.nextLine();
            if("886".equalsIgnoreCase(str)){
                System.out.println("拜拜，欢迎下次再玩！！");
                break;
            }else{
                System.out.println("你输入的字符串是 ："+str);
            }
        }
        scanner.close();
    }
}
