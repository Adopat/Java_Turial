package chapter12;

import java.io.*;
/**
 * OutputStreamWriter 是字符流到字节流的桥梁
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) throws Exception{
        // 使用GBK进行编码写入文件
        test("C:\\myNote\\test_20210907\\1\\OutputStreamWriterTest.txt");
        System.out.println("============================================");
        test1("C:\\myNote\\test_20210907\\1\\OutputStreamWriterTest.txt");


    }
    // 用GBK 进行编码写入磁盘中
    public static void test(String path) throws Exception{
        OutputStream os = new FileOutputStream(path);
        OutputStreamWriter osw = new OutputStreamWriter(os,"GBK");
        BufferedWriter bfw = new BufferedWriter(osw);
        bfw.write("hello world!!");
        bfw.newLine();
        bfw.write("明天要上班了！！");
        bfw.flush();
        bfw.close();
        osw.close();

    }
    // 使用GBK解码进行文件读取，字节流转 字符流
    public static void test1(String path) throws Exception{
        InputStream is = new FileInputStream(path);
        // 如果这里使用 utf8进行解码，会出现乱码的情况，因为编码方式是GBK,将字节流转为字符流
        InputStreamReader isr = new InputStreamReader(is,"GBK");
        // 使用BuffereReader读取字符流
        BufferedReader bfr = new BufferedReader(isr);
        String line;
        while((line = bfr.readLine())!=null){
            System.out.println(line);
        }
        isr.close();
        bfr.close();
    }
}
