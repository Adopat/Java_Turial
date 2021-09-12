package chapter12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * InputStreamReader 一般使用在涉及到中文操作的场景中
 * 将内容输出到持续存储设备上为 编码,从持久性设备中为解码,编码和解码不一致会导致乱码
 * InputStreamReader 是字节流 到字符流的桥梁 读取 解码，字节存储二进制
 */
public class InpurStreamReaderTest {
    public static void main(String[] args) throws Exception{
        test("C:\\myNote\\test_20210907\\1\\InputStreamReaderTest.txt");
    }
    public static void test(String path) throws Exception{
        // 读取字节流
        InputStream is = new FileInputStream(path);
        // 将字节流转为字符流，默认解码为utf8
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);
        String str;
        while((str = bf.readLine())!=null){
            System.out.println("每一行的内容是: "+str);
        }
        isr.close();
        // 在这里 BufferedReader执行close()方法不会关闭 InputStreamReader 流 所以要显示 关闭 InputStreamReader
        bf.close();

    }
}
