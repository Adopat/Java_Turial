package chapter12;

import java.io.*;

/**
 * IO 流中异常的处理 JDK6以前的处理方法 在finally 中做多次判断进行流的关闭
 */
public class TryCatchTest {
    public static void main(String[] args){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            InputStream is = new FileInputStream("C:\\myNote\\test_20210907\\1\\P002.jpg");
            bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream("C:\\myNote\\test_20210907\\1\\COPY_20210913_P002.jpg");
            bos = new BufferedOutputStream(os);
            int size;
            byte[] buff = new byte[1024];
            while( (size = bis.read(buff))!=-1){
                bos.write(buff,0,size);
            }
        }catch (Exception e){
                e.printStackTrace();
        }finally {
            if(bis!=null){
                try{
                    bis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }finally {
                    if(bos!=null){
                        try{
                            bos.close();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    }
}
