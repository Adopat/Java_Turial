package chapter5_6;
// static 修饰的方法或变量，优先于对象执行，所以内存有会先出现static 修饰的内容，后有对象的内容
public class Student {
    static String sex;
    // 静态代码块主要用于初始化复杂的静态成员初始化的工具，//静态内容由于非静态内容，所以静态代码块比构造方法优先执行
    static {
        sex ="男生";
        System.out.println("静态代码块被执行了！！");
    }
    static int age;
   String name;
   // 成员方法可以访问静态属性
   public int getAge(){
       return age;

   }
//   // 静态方法不能访问成员属性
//   public static String getNmme(){
//       return name;
//   }
}
