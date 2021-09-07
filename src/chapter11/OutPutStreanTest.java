package chapter11;

import java.io.*;

public class OutPutStreanTest {
    public static void main(String[] args) throws IOException{
        OutputStream outputStream = new FileOutputStream("C:\\myNote\\test_20210907\\4\\4.txt");
        OutputStream outputStream1 = new FileOutputStream("C:\\myNote\\test_20210907\\4\\5.txt");
        testOut(outputStream);
        System.out.println("======OutputStream写文件时如果文件不存在会自动创建=======");
        testOut(outputStream1);
        System.out.println("=============利用FileInputStream和FileOutputStream进行文件拷贝====================");
        File file = new File("C:\\myNote\\test_20210907\\4\\4.txt");
        InputStream inputStream = new FileInputStream(file);
        // append 为True 代表追加，默认时覆盖
        OutputStream outputStream2 = new FileOutputStream("C:\\myNote\\test_20210907\\4\\copy4.txt",true);
        testCopy(inputStream,outputStream2);
    }

    /**
     * 写取单个字符
     * @param outputStream
     * @throws IOException
     */
    public static void testOut(OutputStream outputStream) throws IOException {
        int a =36;
        outputStream.write(a);
        int b = 90;
        outputStream.write(b);
        outputStream.close();
    }
    /**
     * 进行文件拷贝，先读取，后写入
     */
    public static void testCopy(InputStream inputStream,OutputStream outputStream) throws IOException{
        byte[] buff = new byte[inputStream.available()];
        int length;
        while((length=inputStream.read(buff))!=-1){
            outputStream.write(buff,0,length);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
    }
}
