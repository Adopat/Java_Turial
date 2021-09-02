package chapter9_1;

import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args){
        String str1 ="justin";
        String str2 ="Justin";
        System.out.println(Objects.equals(str1,str2));
        String [] arr1 = {"aa","bb","cc"};
        String [] arr2 = {"aa","bb","cc"};
        // 数组的比较使用deepEquals 先比较内存地址，在比较值
        System.out.println(Objects.deepEquals(arr1,arr2));
        // 返回对象的hashCode 若传入的是null 值则返回 0
        System.out.println(Objects.hashCode("aa"));
        System.out.println(Objects.hashCode(null));
        // 返回多个对象的hashCode总和
        System.out.println(Objects.hash("aa","bbb",11,arr1,null));
    }
}
