package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
            test("C:\\myNote\\test_20210907\\1\\BufferedWriterTest.txt\\");
//            int[] test = {1,2,3,4,5,6,7,8,0};
//            System.out.println(test[1]);
    }
    public static void test(String path) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
        writer.write(90);
        writer.write('q');
        writer.write("hello world");
        // 写入换行符
        writer.newLine();
        // 写如字符串
        writer.write("我在北大上大学");
        // 写入换行
        writer.newLine();
        // 写入字符数组 可以对字符数组进行截取
        String ch = "我在川大上大学";
        writer.write(ch.toCharArray(),0,1);
        // 在BufferedWriter 中调用close方法会自动 调用 flush方法
        writer.close();
    }
}
