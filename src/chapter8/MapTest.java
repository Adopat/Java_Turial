package chapter8;

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        // hashMap 无序
        hashMap();
        // treeMap 有序
        System.out.println("+++++++++++++++++++++++++++");
        treeMap();
        System.out.println("++++++++++++++++++++++++++++++");
        // linkedHashMap() 是有序的
        linkedHashMap();
    }
    public static void hashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        // 增加entry 元素
        hashMap.put("A小明", "广东深圳");
        hashMap.put("B小红", "广东东莞");
        hashMap.put("C小绿", "广东惠州");
        hashMap.put("D小蓝", "广东广州");
        // 打印hashMap
        //hashMap = {B小红=广东东莞, A小明=广东深圳, D小蓝=广东广州, C小绿=广东惠州}
        System.out.println("hashMap = " + hashMap);
        // 获取 value 集合
        Collection<String> collection = hashMap.values();
        System.out.println(collection);
        // 根据key 获取value
        String value = hashMap.get("A小明");
        System.out.println("value =" + value);
        // 返回hashMap 中元素数量
        int size = hashMap.size();
        System.out.println("size =" + size);
        // 判断是否含有某个key
        boolean isContainsKey = hashMap.containsKey("A小明");
        System.out.println("isContainsKeys =" + isContainsKey);
        // 获取所有的key集合
        Set<String> keySet = hashMap.keySet();
        System.out.println("keySet =" + keySet);
        // 返回一个set集合，集合的类型为Map.Entry
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("key=" + entry.getKey() + ",value" + entry.getValue());
        }
        // 判断是否为空
        boolean beforeisEmpty = hashMap.isEmpty();
        System.out.println("beforeisEmpty="+beforeisEmpty);
        // 清空Map
        hashMap.clear();
        // 清除之后是否为空
        boolean afterisEmpty = hashMap.isEmpty();
        System.out.println("afterisEmpty="+afterisEmpty);
    }
        public static void treeMap(){
            TreeMap<String,String> treeMap = new TreeMap<>();
            // 增加entry 元素
            treeMap.put("A小明","广东深圳");
            treeMap.put("B小红","广东东莞");
            treeMap.put("C小绿","广东惠州");
            treeMap.put("D小蓝","广东广州");
            // 打印treeMap
            //treeMap = {A小明=广东深圳, B小红=广东东莞, C小绿=广东惠州, D小蓝=广东广州}
            System.out.println("treeMap = "+treeMap);
            // 获取 value 集合
            Collection<String> collection = treeMap.values();
            System.out.println(collection);
            // 根据key 获取value
            String value = treeMap.get("A小明");
            System.out.println("value ="+value);
            // 返回treeMap 中元素数量
            int size = treeMap.size();
            System.out.println("size ="+size);
            // 判断是否含有某个key
            boolean isContainsKey = treeMap.containsKey("A小明");
            System.out.println("isContainsKeys ="+isContainsKey);
            // 获取所有的key集合
            Set<String> keySet = treeMap.keySet();
            System.out.println("keySet ="+keySet);
            // 返回一个set集合，集合的类型为Map.Entry
            Set<Map.Entry<String,String>> entrySet = treeMap.entrySet();
            for(Map.Entry entry:entrySet){
                System.out.println("key="+entry.getKey()+",value"+entry.getValue());
            }
            // 判断是否为空
            boolean beforeisEmpty = treeMap.isEmpty();
            System.out.println("beforeisEmpty="+beforeisEmpty);
            // 清空Map
            treeMap.clear();
            // 清除之后是否为空
            boolean afterisEmpty = treeMap.isEmpty();
            System.out.println("afterisEmpty="+afterisEmpty);

        }
    public static void linkedHashMap(){
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        // 增加entry 元素
        linkedHashMap.put("A小明","广东深圳");
        linkedHashMap.put("B小红","广东东莞");
        linkedHashMap.put("C小绿","广东惠州");
        linkedHashMap.put("D小蓝","广东广州");
        // 打印LinkedHashMap
        //linkedHashMap = {A小明=广东深圳, B小红=广东东莞, C小绿=广东惠州, D小蓝=广东广州}
        System.out.println("linkedHashMap = "+linkedHashMap);
        // 获取 value 集合
        Collection<String> collection = linkedHashMap.values();
        System.out.println(collection);
        // 根据key 获取value
        String value = linkedHashMap.get("A小明");
        System.out.println("value ="+value);
        // 返回LinkedHashMap 中元素数量
        int size = linkedHashMap.size();
        System.out.println("size ="+size);
        // 判断是否含有某个key
        boolean isContainsKey = linkedHashMap.containsKey("A小明");
        System.out.println("isContainsKeys ="+isContainsKey);
        // 获取所有的key集合
        Set<String> keySet = linkedHashMap.keySet();
        System.out.println("keySet ="+keySet);
        // 返回一个set集合，集合的类型为Map.Entry
        Set<Map.Entry<String,String>> entrySet = linkedHashMap.entrySet();
        for(Map.Entry entry:entrySet){
            System.out.println("key="+entry.getKey()+",value"+entry.getValue());
        }
        // 判断是否为空
        boolean beforeisEmpty = linkedHashMap.isEmpty();
        System.out.println("beforeisEmpty="+beforeisEmpty);
        // 清空Map
        linkedHashMap.clear();
        // 清除之后是否为空
        boolean afterisEmpty = linkedHashMap.isEmpty();
        System.out.println("afterisEmpty="+afterisEmpty);

    }
}
