package chapter12;


import java.io.*;

public class FileWriterTest {
    public static void main(String[] args) throws IOException{
        //test();
        //System.out.println("===============");
        test1();
    }
    public static void test() throws IOException {
        String dir = "C:\\myNote\\test_20210907\\1\\FileWriter.txt";
        Writer wr = new FileWriter(dir);
        wr.write(65);// 字母A
        wr.write(90);// 字母 Z
        wr.write(49);// 数字1
        wr.write(97);// 字母a
        wr.write(122);// 字母z
        wr.write(32);// 空格
        wr.write("hello world!!");
        wr.flush();
        wr.close();

    }
    public static void test1() throws IOException {
        // 不存在文件会自动进行创建
        String dir = "C:\\myNote\\test_20210907\\1\\FileWriter.txt";
        File file = new File(dir);
        // append 参数为true 代表追加
        Writer wr = new FileWriter(file,true);
        wr.write(65);// 字母A
        wr.write(90);// 字母 Z
        wr.write(49);// 数字1
        wr.write(97);// 字母a
        wr.write(122);// 字母z
        wr.write(32);// 空格
        wr.write("hello world!!");
        wr.write('Q');
        wr.flush();
        wr.close();

    }

}
