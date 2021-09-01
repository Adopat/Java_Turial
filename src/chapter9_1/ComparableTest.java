package chapter9_1;

import java.util.*;

// Java 中 sort
public class ComparableTest {
    public static void main(String[] args){
        sortList();
        System.out.println("====================");
        System.out.println("comparableTest开始执行了！！！！");
        comparableTest();

    }
    public static void sortList(){
        List<User> list = new ArrayList<>();
        list.add(new User("aaa",30));
        list.add(new User("bbb",29));
        list.add(new User("ccc",28));
        list.add(new User("ddd",27));
        System.out.println(list);
        // 按照年龄升序
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("排序后规则，按照年龄升序"+list);
        // 按照名字升序
        Collections.sort(list, new Comparator<User>() {
            @Override
            // compare 属于 Comparator 的方法,Comparator 和 Comparable的区别，如果开发前已经明确知道排序规则，应该使用Comparable,
            // 临时排序使用 Comparator
            public int compare(User o1, User o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();
                int result = name2.compareTo(name1);
                return result;
            }
        });
        System.out.println("按照名字进行排序="+list);
        // String 实现了 Comparable接口，Comparable接口是用来定制排序规则的,实现compareTo 方法
        //
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");
        System.out.println("排序前list1 ="+list1);
        // 默认是升序
        Collections.sort(list1,Comparator.naturalOrder());
        System.out.println("升序后list1="+list1);
        Collections.sort(list1,Comparator.reverseOrder());
        System.out.println("降序后list1="+list1);
    }
    public static void comparableTest(){
        // HashSet无序
        Set<User> set = new HashSet<>();
        set.add(new User("aaaa",30));
        set.add(new User("bbbb",29));
        set.add(new User("cccc",28));
        set.add(new User("dddd",27));
        set.add(new User("eeee",26));
        System.out.println("排序前="+set);
        System.out.println("++++++++++++++++++++++++++++");
        // TreeSet 是可排序的，要实现Comparable接口
        // TreeSet 无序，但是是可排序的，因为实现了Comparable接口
        Set<User> set1 = new TreeSet<>();
        set1.add(new User("aaaa",30));
        set1.add(new User("bbbb",29));
        set1.add(new User("cccc",28));
        set1.add(new User("dddd",27));
        set1.add(new User("eeee",26));
        System.out.println("排序前set1="+set1);
        System.out.println("==========================");

    }



}
class User implements Comparable{
    private String name;
    private int age;
    public User(){

    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    // 实现Comparable接口 ，按照年龄升序
//    public int compareTo(Object o) {
//        if(o instanceof User){
//            User user1 = (User)o;
//            return this.age-user1.getAge();// 升序
//        }
//        //
//        return 0;
//    }


    @Override
    // 按照姓名排序
    public int compareTo(Object o) {
        if(o instanceof User){
            User user1 = (User)o;
            String name2 = user1.getName();
//            // 按照姓名升序
//            int result = this.name.compareTo(name2);
//            return result;
            // 按照姓名降序
            int result = name2.compareTo(this.name);
            return result;
        }
        //
        return 0;
    }
}

