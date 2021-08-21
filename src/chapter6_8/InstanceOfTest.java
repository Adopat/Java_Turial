package chapter6_8;
// Java实现多态有三个必要条件：继承(接口)、重写、向上转型。
public class InstanceOfTest {
    public static void main(String[] args){
        Student student = new Student();
        // 判断 student 是否实现了Person接口
        boolean result = student instanceof Person;
        //System.out.println(result);
        // 父类引用指向子类对象，因为子类重写了父类的方法，根据就近原则，优先调用子类的重写方法
        Person person1 = new Student();
        Person person2 = new Teacher();
        System.out.println("person1 instanceof Student:");
        System.out.println(person1 instanceof Student);
        System.out.println("person2 instanceof Student:");
        System.out.println(person2 instanceof Student);
        System.out.println("================================");
        person1.talk();
        System.out.println("===================================");
        person2.talk();
        System.out.println("=====================================");
        // 向下转型，如果要调用子类特有的方法要进行向下转型
        Student student11 = (Student) person1;
        student11.run();

        if(person1 instanceof Student){
            // 类型强转
            Student student1 = (Student) person1;
            student1.talk();
        }
        if(person2 instanceof Teacher){
            Teacher teacher = (Teacher) person2;
            teacher.talk();
        }





    }
}
