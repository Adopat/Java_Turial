package chapter19;

/**
 * @author Adopat
 * @version 1.0
 * @description: 基本注解 @Override
 * @date 2022/10/11 15:53
 */
public class AnnotationDemo {
    private int price;
    private String name;

    public AnnotationDemo() {
    }

    public AnnotationDemo(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnnotationDemo{}";
    }

    public static void main(String[] args) {


    }
}
