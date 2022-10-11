package chapter19;

/**
 * @author Adopat
 * @version 1.0
 * @description: 基本注解 @Deprecated
 * @date 2022/10/11 15:53
 */
@Deprecated
public class AnnotationDemo1 {
    @Deprecated
    private int price;
    private String name;

    public AnnotationDemo1() {
    }

    public AnnotationDemo1(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    @Deprecated
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
    @SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
        AnnotationDemo1 annotationDemo1 = new AnnotationDemo1();
        annotationDemo1.setPrice(1111);
        System.out.println("price ="+annotationDemo1.getPrice());


    }
}
