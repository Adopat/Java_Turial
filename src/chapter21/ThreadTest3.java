package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description: 多线程创建方式二 实现Runnable接口
 * @date 2022/10/12 10:53
 */
/*
    1.创建一个实现Runnable接口的类。
    2.实现类去实现Runnable接口中的抽象方法：run()。
    3.创建实现类的对象。
    4.将此对象作为参数传到Thread类的构造器中，创建Thread类的对象。
    5.通过Thread类的对象调用start()方法。
 */

public class ThreadTest3 {
    public static void main(String[] args) {
        // 3.创建实现类对象
        RunnableThread runnableThread = new RunnableThread();
        // 4.创建Thread类的对象,并将实现类的对象当做参数传入构造器
        Thread t1 = new Thread(runnableThread);
        // 5.使用Thread类的对象去调用Thread类的start()方法:①启动了线程 ②Thread中的run()调用了Runnable中的run()
        t1.start();
        //在创建一个线程时，只需要new一个Thread类就可,不需要new实现类
        Thread t2 = new Thread(runnableThread);
        t2.start();

    }
}
// 1.创建一个实现Runnable接口的类。
class RunnableThread implements Runnable {
    // 2.实现类去实现Runnable接口中的抽象方法：run()。
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " :\t" + i);

            }
        }
    }
}
