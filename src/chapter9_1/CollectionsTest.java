package chapter9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args){
        testSort();
        System.out.println("=======================================");
        testShuffle();

    }
    public static void testSort(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        list.add("eee");
        list.add("ddd");
        System.out.println("排序前:"+list);
        Collections.sort(list);
        System.out.println("排序后："+list);
        // 升序排序
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println("升序排序= "+list);
        // 降序排序
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("降序排序="+list);
    }
    public static void testShuffle(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("J");
        list.add("Q");
        list.add("K");
        System.out.println("打乱顺序之前= "+list);
        Collections.shuffle(list);
        System.out.println("打乱顺序之后 ="+list);
    }
}
