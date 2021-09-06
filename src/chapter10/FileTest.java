package chapter10;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args){
        String dir ="C:\\myNote";
        String name = "a.txt";
        File file = new File(dir,name);
        System.out.println(file.getPath());
        System.out.println("=======test1()======文件的基本查询和判断======");
        test1(file);
        System.out.println("=======test2()======文件遍历======");
        test2();
        System.out.println("=======test3()======目录的创建和删除====");
        test3();
    }
    public static void test1(File file){
        // 文件的查询和判断
        System.out.println(File.separator);
        System.out.println("基本路径 getPath()= "+file.getPath());
        System.out.println("绝对路径 getAbsolutePath()= "+file.getAbsolutePath());
        System.out.println("文件名 getName() ="+file.getName());
        System.out.println("父路径名 getParent() ="+file.getParent());
        System.out.println("是否是绝对路径 ="+file.isAbsolute());
        System.out.println("是否是一个目录 ="+file.isDirectory());
        System.out.println("是否是一个文件 ="+file.isFile());
        System.out.println("文件或目录是否存在 ="+file.exists());
    }
    // 文件遍历
    public static void test2(){
        String dir ="C:\\myNote";
        File file = new File(dir);
        String[] arr = file.list();
        for(String temp:arr){
            System.out.println(temp);
        }
    }
    // 目录和文件的创建
    public static void test3() {
        String dir = "C:\\myNote";
        // 创建指定的目录
        File mkdir = new File(dir +"\\testMakedir");
        mkdir.mkdir();
        // 创建多个层级的目录
        File mkdirs = new File(dir+"\\testMakedirs\\aa\\bb\\cc\\dd");
        mkdirs.mkdirs();
        // 创建文件
        File newFile = new File(dir+"\\a.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("删除前================");
        System.out.println("文件名="+newFile.getName());
        System.out.println("文件是否存在="+newFile.exists());
        System.out.println("删除后========================");
        newFile.delete();
        System.out.println("文件名="+newFile.getName());
        System.out.println("文件是否存在="+newFile.exists());
    }

}
