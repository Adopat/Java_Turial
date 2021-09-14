package chapter14;

/**
 * Object类是所有类的基类
 */
public class ObjectTest {
    public static void main(String[] args){
        Class clazz = new ObjectTest().getClass();
        System.out.println(clazz.getName());
        //System.out.println(clazz.toString());
        System.out.println(clazz.hashCode());
    }
}
