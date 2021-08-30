package chapter8;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args){
        // ArrayList只能存储引用数据类型
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        // 添加元素
        arrayList.add("tom");
        arrayList.add("pony");
        arrayList.add("jack");
        // 打印ArrayList
        System.out.println(arrayList);
        // 更新元素
        arrayList.set(0,"justin");
        System.out.println(arrayList);
        // 返回大小
        int size = arrayList.size();
        System.out.println("size ="+size);
        // 通过索引删除元素
        String removeString = arrayList.remove(0);
        System.out.println(removeString);
        // 通过对象删除元素
        boolean removeObj = arrayList.remove("justin");
        System.out.println(removeObj);
        // 判断arrayList 是否为空
        boolean emptyFlag = arrayList.isEmpty();
        System.out.println(emptyFlag);
        // 清空arrayList
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        // LinkedList 是基于链表实现的，增删比较快 特有API
        linkedList.add("justin");
        linkedList.add("pony");
        linkedList.add("jack");
        // 获取第一个元素
        String firstString = linkedList.getFirst();
        // 获取最后一个元素
        String lastString = linkedList.getLast();
        System.out.println(firstString);// justin
        System.out.println(lastString);// jack





    }
}
