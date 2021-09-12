package chapter11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用BufferedOutputStream BufferedInputStream 进行文件的拷贝
 */
public class BufferTest {
    public static void main(String[] args){

        try{
            // 创建FileInputStream
            FileInputStream fis = new FileInputStream("C:\\myNote\\test_20210907\\1\\P002.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            // 创建FileOutputStream
            FileOutputStream fos = new FileOutputStream("C:\\myNote\\test_20210907\\1\\copyP002.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int size;
            byte [] buff = new byte[1024];
            while((size =bis.read(buff))!=-1){
                bos.write(buff,0,size);
            }
            bis.close();
            bos.close();
            // 注意不用显示的关闭FileInputStream JDK7新特性，在try catch 中调用 缓冲输入输出流的close方法时会自动关闭 FileOutputStream流
            // 这里也不用调用 flush方法，会自动调用
        }catch (Exception e){

        }

    }
}
