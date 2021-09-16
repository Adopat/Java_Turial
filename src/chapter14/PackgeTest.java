package chapter14;
/**
 * 掌握包装类和基本数据类型的转换
 */
public class PackgeTest {
    public static void main(String[] args){
        Integer i = new Integer(10);
        System.out.println(i);
        int i1 = i.intValue();
        System.out.println(i1);
        Character c = new Character('c');
        System.out.println(c);
        char c1 = c.charValue();
        System.out.println(c1);
        Boolean bool = new Boolean(true);
        System.out.println(bool);
        boolean bool1 = bool.booleanValue();
        System.out.println(bool1);
    }
}
