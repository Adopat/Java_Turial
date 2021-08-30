package chapter9_1;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args){
        testSet();
        System.out.println("+++++++++++++++++++++");
        testList();

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
}
