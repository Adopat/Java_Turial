package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description:  多线程安全问题的解决方式二：同步方法
 * @date 2022/10/12 14:49
 */
public class SafeTicketsWindow2 {
    public static void main(String[] args) {
        WindowThread2 windowThread2 = new WindowThread2();
        Thread t1 = new Thread(windowThread2);
        Thread t2 = new Thread(windowThread2);
        Thread t3 = new Thread(windowThread2);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowThread2 implements Runnable {
    private int tiketsNum = 100;
    @Override
    public void run() {
        while (tiketsNum > 0) {
            // 调用同步方法
            show();
        }
    }

    //
    private synchronized void show() { //同步监视器：this
        if (tiketsNum > 0) {
            try {
                //手动让线程进入阻塞,增大安全性发生的概率
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":\t票号:" + tiketsNum + "\t剩余票数:" + --tiketsNum);

        }

    }

}
