package chapter4_7;

public class Student {
    // 静态变量 静态变量一般使用大写
    public static final String PERFIX ="MY NAME IS";
    // 实例变量年龄(属性)
    private int age;
    // 实例变量姓名
    private  String name;
    // 将实例变量设置为 public
    public static String gender;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    // 自我介绍方法
    public String introduce(){
        // content 是局部变量 局部变量需要初始化才能使用,静态变量和实例变量不用初始化，含有默认值
        String content ="SIX SXI";
        return  content;
    }
}
