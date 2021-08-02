package test;
import java.util.Random;
/**
 * 这个是作业
 * @author Justin
 * @version 1.0.0
 */
public class RandomTest {
    /*
     * 方法入口
     */
    public static void main(String[] args){
        // 这是输出
        System.out.println("My First Program");
        System.out.println("Welcome to Nvt");
        Random random = new Random();
        // 随机生成True or False
        boolean flag = random.nextBoolean();
        System.out.println(flag);
    }
}
