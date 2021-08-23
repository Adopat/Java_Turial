package chapter6_6;

public class AbstratTest {
    public static void main(String[] args){
        Bicycle bi = new Bicycle();
        bi.stop();
        bi.run();
        Auto au = new Auto();
        au.stop();
        au.run();
        //抽象类不能实例化，有些方法没有实现
        // new Vehicle();

    }
}
