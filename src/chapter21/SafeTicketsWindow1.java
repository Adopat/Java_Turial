package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description: 线程安全问题解决方法一 使用同步代码块
 * @date 2022/10/12 14:49
 */
public class SafeTicketsWindow1 {
    public static void main(String[] args) {
        WindowThread1 windowThread1 = new WindowThread1();
        Thread t1 = new Thread(windowThread1);
        Thread t2 = new Thread(windowThread1);
        Thread t3 = new Thread(windowThread1);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}

class WindowThread1 implements Runnable {

    private int tiketsNum = 100;
    //由于，Runnable实现多线程，所有线程共用一个实现类的对象，所以三个线程都共用实现类中的这个Object类的对象。
    Object obj = new Object();
    //如果时继承Thread类实现多线程，那么需要使用到static Object obj = new Object();
    public void run() {
        //Object obj = new Object();
        //如果Object对象在run()方法中创建，那么每个线程运行都会生成自己的Object类的对象，并不是三个线程的共享对象，所以并没有给加上锁。
        while (true) {
            synchronized (obj) {
                if (tiketsNum > 0) {
                    try {
                        //手动让线程进入阻塞,增大安全性发生的概率
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":\t票号:" + tiketsNum + "\t剩余票数:" + --tiketsNum);
                } else {

                    break;

                }

            }

        }

    }

}
