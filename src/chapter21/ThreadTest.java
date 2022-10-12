package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description: 创建线程的第一种方法 继承 Thread 多线程执行同一代码
 * @date 2022/10/12 9:55
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":\t" + i);
            }
        }
    }

    public static void main(String[] args) {
        // 创建一个Thread类的子类对象
        Thread t1 = new ThreadTest();
        //通过此对象调用start()启动一个线程

        t1.start();

        //注意:已经启动过一次的线程无法再次启动

        //再创建一个线程

        ThreadTest t2 = new ThreadTest();

        t2.start();


        //另一种调用方法,此方法并没有给对象命名

        new ThreadTest().start();


        System.out.println("主线程");
    }
}
