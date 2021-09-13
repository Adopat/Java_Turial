package chapter12;

import java.io.*;

/**
 * IO 流异常 在JDK7以后的写法，推荐使用这种写法 在try()括号中中定义流，关闭流的顺序是自下向上
 */
public class TryCatchTest1 {
    public static void main(String[] args){
        try(
                InputStream is = new FileInputStream("C:\\myNote\\test_20210907\\1\\P002.jpg");
                BufferedInputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream("C:\\myNote\\test_20210907\\1\\20210913_P002.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(os);
                ){
                    int size;
                    byte [] buff = new byte[1024];
                    while( (size = bis.read(buff))!=-1){
                        bos.write(buff,0,size);
                    }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
