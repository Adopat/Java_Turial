package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description: 创建多线程的方法一 继承Thread 类 多线程执行多段代码
 * @date 2022/10/12 10:05
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        new Thread01().start();
        new Thread02().start();

    }

}

class Thread01 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":\t" + i);
            }
        }
    }
}

class Thread02 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":\t" + i);

            }

        }
    }
}
