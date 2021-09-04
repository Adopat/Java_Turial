package chapter9_1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NativeMethodTest {
    public static void main(String[] args){
        test1();

    }
    // Teacher 重写了hashCode() 和 equals方法保证了数据不重复
    public static void test1(){
        Set<Teacher> set = new HashSet<>();
        set.add(new Teacher("张三",22));
        set.add(new Teacher("李四",32));
        set.add(new Teacher("王五",42));
        set.add(new Teacher("赵六",52));
        set.add(new Teacher("赵六",52));
        System.out.println(set);
        System.out.println("=================================");
        // Teacher1 因为没有重写hashCode和equals方法，所以set存放的元素为重复的
        Set<Teacher1> set1 = new HashSet<>();
        set1.add(new Teacher1("张三",22));
        set1.add(new Teacher1("张三",22));
        set1.add(new Teacher1("张三",22));
        set1.add(new Teacher1("张三",22));
        set1.add(new Teacher1("张三",22));
        set1.add(new Teacher1("张三",22));
        System.out.println(set1);


    }
}
class Teacher{
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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
    /*
      equals重写规则
      1.判断地址是否一样
      2.非空判断和class 类型判断
      3.强转
      4.对象里面的字段一一匹配
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Teacher1{
    private String name;
    private int age;

    public Teacher1() {
    }

    public Teacher1(String name, int age) {
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
        return "Teacher1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
