package chapter11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\myNote\\test_20210907\\1\\1.txt";
        // FileInputStream第一种构造方法
        InputStream inputStream = new FileInputStream(filePath);
        test(inputStream);
        System.out.println("========读取整个文件方法运行===========");
        File file = new File("C:\\myNote\\test_20210907\\2\\2.txt");
        // FileInputStream第二种构造方法
        InputStream inputStream1 = new FileInputStream(file);
        test1(inputStream1);
        // File 类的另一种构造方法
        System.out.println("===================File类的另一种构造方法===================");
        String rootPath ="C:\\myNote\\test_20210907\\3";
        String fileName ="3.txt";
        File file1 = new File(rootPath,fileName);
        InputStream inputStream2 = new FileInputStream(file1);
        test1(inputStream2);
        inputStream.close();
        inputStream1.close();
        inputStream2.close();

    }
    /*
       读取单个字节
     */
    public static void test(InputStream inputStream) throws IOException{
        int size = inputStream.read();
        System.out.println(size);
        System.out.println((char)size);
        System.out.println("======skip方法=====");
        // skipSize返回long 类型
        long skipSize = inputStream.skip(10);
        System.out.println("跳过10字节后的读取结果");
        int size1 = inputStream.read();
        System.out.println(size1);
        System.out.println((char)size1);

    }
    /*
       读取整个文件
     */
    public static void test1(InputStream inputStream) throws IOException{
        byte[] buff = new byte[inputStream.available()];
        int length;
        while((length = inputStream.read(buff))!=-1){
            System.out.println(new String(buff,0,length));

        }
    }
}
