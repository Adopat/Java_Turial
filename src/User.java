import java.util.Date;
import com.ali.Student;
/**
 * 定义一个user类
 * @auth:Justin
 * @version 1.0.0
 */
public class User {
    public void sleep(){
        // 单行注释
        /*
         *多行注释
         *
         */
        System.out.println("i want to sleep");
        System.out.println("i not want to sleep");
    }
    public static void main(String[] args){
        //User user = new User();
        //user.sleep();
        Student stu = new Student();
        stu.run();
        Date date = new Date();
        System.out.println(date);
    }
}
