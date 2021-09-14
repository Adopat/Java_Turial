package chapter14;

public class MathTest {
    public static void main(String[] args){
        System.out.println("平方根："+Math.sqrt(16));
        System.out.println("立方根 ："+Math.cbrt(8));
        System.out.println("幂计算："+Math.pow(4,2));
        System.out.println("幂计算："+Math.pow(4,3));
        System.out.println("向上取整:"+Math.ceil(10.1));
        System.out.println("向上取整:"+Math.ceil(-10.1));
        System.out.println("向下取整:"+Math.floor(10.1));
        System.out.println("向下取整:"+Math.floor(10.9));
        System.out.println("向下取整:"+Math.floor(-10.9));
        System.out.println("产生[0,1)随机数"+Math.random());
        // 产生[1-10)的随机数
        System.out.println(Math.random()*10+1);
        // 产生[1-10)的随机整数
        int random = (int)(Math.random()*10+1);
        System.out.println(random);
        for(int i=0;i<10;i++){
            int random1 = (int)(Math.random()*10+1);
            System.out.println(random1);
        }

    }
}
