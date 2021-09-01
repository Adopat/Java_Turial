package chapter9_1;

import java.util.*;

public class CollectionsTest1 {
    public static void main(String[] args){
        testMax();
        System.out.println("===================");
        testMin();
        System.out.println("====================");
        unmodifyList();


    }

    public static void testMax(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("小明",20));
        list.add(new Student("小红",18));
        list.add(new Student("小绿",30));
        list.add(new Student("小蓝",25));
        list.add(new Student("小黄",41));
        // 集合对象取最大
        Student stu = Collections.max(list, new Comparator<Student>() {
            @Override
            // o2代表的是后传入的元素,后传入的元素比之前的元素小，所以小的元素在后，是升序
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();// 升序
            }
        });
        System.out.println("最大的学生对象是 ="+stu);

    }
    public static void testMin(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("小明",20));
        list.add(new Student("小红",18));
        list.add(new Student("小绿",30));
        list.add(new Student("小蓝",25));
        list.add(new Student("小黄",41));
        Student stu = Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();// 降序
            }
        });
        System.out.println("最小的学生对象是 ="+stu);

    }
    // 将集合对象修改为只读对象
    public static void unmodifyList(){
        List<String> list = new ArrayList<>();
        list.add("好好学习");
        list.add("天天向上");
        list = Collections.unmodifiableList(list);
        System.out.println("list ="+list);
        //list.add("曲项向天歌");
        Set<String> set = new HashSet<>();
        set.add("一条大路通南北");
        set.add("我家住在黄浦江");
        // 将set 集合修改为只读
        set = Collections.unmodifiableSet(set);
        System.out.println("set ="+set);
       // set.add("北京大学是我家");
        // 将map 修改为只读
        Map<String,String> map = new HashMap<>();
        map.put("北京","中国");
        map.put("东京","日本");
        map = Collections.unmodifiableMap(map);
        System.out.println("map ="+map);
        //map.put("华盛顿","美国");
    }
}
class Student{
    private String name;
    private int age;
    public Student(String name,int age){
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
