package chapter12;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest  {
    public static void main(String[] args) throws Exception{
        //test("C:\\myNote\\test_20210907\\1\\BufferedReaderTest.txt");
        test1("C:\\myNote\\test_20210907\\1\\BufferedReaderTest.txt");
    }
    public static void test(String path) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        // read 方法
        int size;
        char[] buff = new char[1024];
        // 判断流有没有准备好
        if(!reader.ready()){
            System.out.println("流没有准备好");
            return;
        }
        while ((size = reader.read(buff,0,buff.length))!=-1){
            System.out.println(new String(buff,0,size));
        }
        reader.close();
    }
    public static void test1(String path) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(path));


        // 判断流有没有准备好
        if(!reader.ready()){
            System.out.println("流没有准备好");
            return;
        }
        String str="";
        // readLine方法,readLine 使用方便些
        while ((str = reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();
    }

}
