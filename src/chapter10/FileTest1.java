package chapter10;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args){
        String path = "C:\\myNote";
        test(path);
    }

    /**
     * 创建多层文件夹 test_20210907 1 1.txt 2 2.txt ....
     * @param path
     */
    public static void test(String path){
        File rootPath = new File(path+ File.separator+"test_20210907");
        if(!rootPath.exists()){
            rootPath.mkdirs();
        }
        for(int i=0;i<10;i++){
            String firthPath = rootPath+File.separator+(i+1);
            File firstDir = new File(firthPath);
            if(!firstDir.exists()){
                firstDir.mkdir();
            }
            String filePath = firthPath+File.separator+(i+1)+".txt";
            File fileSource = new File(filePath);
            if(!fileSource.exists()){
                try {
                    fileSource.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
