package chapter14;

import java.util.Map;

public class SystemTest {
    public static void main(String[] args){
        System.out.println("hello world");
        System.out.print("hello world");
        System.out.println();
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("os.name"));
        Map<String,String>  map = System.getenv();
        System.out.println(map);
    }
}
