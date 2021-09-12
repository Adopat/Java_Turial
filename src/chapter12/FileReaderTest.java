package chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest {
    public static void main(String[] args) throws Exception{
        test1();
        System.out.println();
        System.out.println("=======================");
        test2();
        System.out.println("=======================");
        test3();
    }
    public static void test1() throws Exception{
        String dir = "C:\\myNote\\test_20210907\\1\\FileReader.txt";
        File file = new File(dir);
        Reader rd = new FileReader(file);
        int size;
        while((size =rd.read())!=-1){
            System.out.print((char)size);
        }
        rd.close();
    }

    /**
     * 通过字符数据缓存读取
     * @throws Exception
     */
    public static void test2() throws Exception{
        String dir = "C:\\myNote\\test_20210907\\1\\FileReader.txt";
        File file = new File(dir);
        Reader rd = new FileReader(file);
        int size;
        char[] buff = new char[1024];
        while((size =rd.read(buff))!=-1){
            // 字符数组转为字符串 new String()
            System.out.println(new String(buff,0,size));
        }
        rd.close();
    }
    public static void test3() throws Exception{
        String dir = "C:\\myNote\\test_20210907\\1\\FileReader.txt";
        // 使用FileReader的另一种构造函数
        Reader rd = new FileReader(dir);
        int size;
        char[] buff = new char[1024];
        while((size =rd.read(buff))!=-1){
            System.out.println(new String(buff,0,size));
        }
        rd.close();
    }

}
