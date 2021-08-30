package chapter8;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("小明");
        set.add("小东");
        set.add("小红");
        set.add("小明");
        // 打印set 集合
        System.out.println("set ="+set);
        // 返回set 大小
        int size = set.size();
        System.out.println("size ="+size);
        // 根据对象删除元素
        set.remove("小明");
        // set 是无序，不可重复的，set没有索引
        boolean isEmpty = set.isEmpty();
        System.out.println("isEmpty ="+isEmpty);
        // HashSet 不能保证元素的排列顺序，TreeSet是SortedSet接口的唯一实现类，可以确保集合处于排序状态
        // HashSet 底层使用的哈希表，TreeSet采用的数据结构是红黑树
        // HashSet中元素可以是null,但是只能有一个，TreeSet不允许放入null
        // 一般使用HashSet,如果需要排序功能是，才使用TreeSet

    }
}
