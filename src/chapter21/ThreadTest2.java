package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description: 创建匿名子类
 * @date 2022/10/12 10:15
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        System.out.println("主线程");
        new Thread(() -> {
            for (int i = 0; i <100; i++) {
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+" :\t"+i);

                }
            }
        }).start();
    }
}
