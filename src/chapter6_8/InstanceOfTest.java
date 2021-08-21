package chapter6_8;

public class InstanceOfTest {
    public static void main(String[] args){
        Student student = new Student();
        // 判断 student 是否实现了Person接口
        boolean result = student instanceof Person;
        //System.out.println(result);
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
