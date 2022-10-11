package chapter18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Adopat
 * @version 1.0
 * @description: 反射
 * @date 2022/10/11 10:38
 */
public class Apple {
    private int price;
    private String brand;

    public Apple() {
    }

    public Apple(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        // 正常调用
        Apple apple = new Apple();
        apple.setPrice(12);
        apple.setBrand("红富士");
        System.out.println(apple);
        // 使用反射调用
        // 使用 forName 获取class对象
        Class apple1 = Class.forName("chapter18.Apple");
        System.out.println("apple1"+apple1);
        // 使用getMethod 获取 类中的方法
        Method setPriceMethod = apple1.getMethod("setPrice", int.class);
        Method setBrandMethod = apple1.getMethod("setBrand", String.class);
        // 根据Class对象获取Constructor对象
        // 调用无参构造函数
        Constructor appleConstructor = apple1.getConstructor();
        // 调用有参构造函数
        Constructor appleConstructor1 = apple1.getConstructor(int.class,String.class);
        // 根据Constructor对象  创建反射对象
        Object appleObject = appleConstructor.newInstance();
        Object appleObject1 = appleConstructor1.newInstance(1000,"狗牌");
        // invoke调用方法
        setBrandMethod.invoke(appleObject,"富士康");
        setPriceMethod.invoke(appleObject,15);
        System.out.println("appleObject ="+appleObject);
        System.out.println("appleObject1 ="+appleObject1);
        System.out.println("=======反射常用API========");
        // 获取反射中Class对象
        // 获取反射中Class对象 方法一 使用 Class.forName 静态方法
        Class clz = Class.forName("java.lang.String");
        System.out.println("clz= "+clz);
        // 获取反射中Class对象 方法二 使用.class方法
        Class clz1 = String.class;
        System.out.println("clz1= "+clz1);
        String str = new String("hello");
        // 获取反射中Class对象 方法三 使用类对象的 getClass() 方法
        Class clz2 = str.getClass();
        System.out.println("clz2= "+clz2);
        // 通过反射创建对象
        Class apple_clz = Apple.class;
        // 1.根据class 对象 创建反射对象 只能调用 无参构造函数
        Object apple_object = apple_clz.newInstance();
        apple_clz.getMethod("setBrand", String.class).invoke(apple_object,"HALISHI");
        System.out.println("apple_object ="+apple_object);
        // 2.根据 Constructor创建反射对象
        Constructor apple_cons = apple_clz.getConstructor(int.class,String.class);
        Object ap_args = apple_cons.newInstance(122222,"雕牌");
        System.out.println("ap_args ="+ap_args);


    }
}
