package chapter11;


import java.io.*;

/**
 * 进行目录下所有文件的拷贝
 */
public class BufferTest1 {
    public static void main(String[] args){
        // 1.获取目录下的所有文件
        String sourcePath = "C:\\myNote\\新建文件夹\\270YWK\\without Text";
        String targetPath = "C:\\myNote\\test_20210907\\1\\target";
        File file = new File(sourcePath);
        File[] files = file.listFiles();
        for(File filesName:files){
            String sourceFileNmae = filesName.getName();
            //copy(filesName.getAbsolutePath(),new File(sourcePath).getParent()+"\\copyPic"+File.separator+sourceFileNmae);
            copy(filesName.getAbsolutePath(),targetPath+File.separator+sourceFileNmae);
        }

    }
    public static void copy(String sourcePath,String targetPath){
        try{
            File targetDir = new File(new File(targetPath).getParent());
            if(!targetDir.exists()){
                targetDir.mkdirs();
            }
            FileInputStream fis = new FileInputStream(sourcePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(targetPath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int size;
            byte[] buff = new byte[1024];
            while((size = bis.read(buff))!=-1){
                bos.write(buff,0,size);

            }
            bis.close();
            bos.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
