package chapter21;

/**
 * @author Adopat
 * @version 1.0
 * @description: 线程安全问题
 * @date 2022/10/12 14:49
 */
public class SafeTicketsWindow {
    public static void main(String[] args) {
        WindowThread windowThread = new WindowThread();
        Thread t1 = new Thread(windowThread);
        Thread t2 = new Thread(windowThread);
        Thread t3 = new Thread(windowThread);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}

class WindowThread implements Runnable {
    private int tiketsNum = 100;

    @Override
    public void run() {
        while (true) {
            if (tiketsNum > 0) {
//                    try {
//                        //手动让线程进入阻塞,增大错票概率
//                        Thread.sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                System.out.println(Thread.currentThread().getName() + ":\t票号:" + tiketsNum + "\t剩余票数:" + --tiketsNum);

                try {

                    //手动让线程进入阻塞,增大重票的概率

                    Thread.sleep(100);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
                tiketsNum--;

            } else {

                break;

            }

        }
    }
}
