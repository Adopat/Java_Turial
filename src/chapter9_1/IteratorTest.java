package chapter9_1;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args){
        testSet();
        System.out.println("+++++++++++++++++++++");
        testList();
        System.out.println("+++++++++++++++++++++++++++++");
        testList1();
        System.out.println("++++++++++++++++++++++++++++++++");
        tetsMap();

    }
    public static void testSet(){
        Set<String> set = new HashSet<>();
        set.add("小明");
        set.add("小东");
        set.add("小红");
        set.add("小明");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public static void testList(){
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小明");
        list.add("小明");
        list.add("小红");
        list.add("小明");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void testList1(){
        List<String> list = new ArrayList();
        list.add("小明");
        list.add("小红");
        list.add("小蓝");
        list.add("小绿");
        list.add("小紫");
        list.add("小橙");
        list.add("小黄");
        System.out.println("遍历前= "+list);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("小黄")){
                // remove 删除前一个元素,注意remove 一定要在next()使用之后在使用，remove()上一个元素,在iterator中不建议使用Collection 的remove()方法，线程不安全
                iterator.remove();
            }
        }
        System.out.println("遍历后= "+list);

    }
    // 遍历Map 集合
    public static void tetsMap(){
        Map<String,String> map = new HashMap();
        map.put("小明","广东深圳");
        map.put("小红","海南");
        map.put("小蓝","广西");
        map.put("小绿","北京");
        map.put("小黄","广东广州");
        Set<Map.Entry<String,String>> entrySet= map.entrySet();
        Iterator<Map.Entry<String,String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("key= "+entry.getKey()+",value= "+entry.getValue());

        }
    }
}
