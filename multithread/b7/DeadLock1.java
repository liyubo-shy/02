package multithread.b7;

/**
 * Created with IntelliJ IDEA.
 *模拟线程死锁
 * @Author: bo
 * @Date: 2022/09/05/0:55
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class DeadLock1 {
    public static void main(String[] args) {
        Dead dead1 = new Dead(true);
        Dead dead2 = new Dead(false);

        Thread t1 = new Thread(dead1);
        Thread t2 = new Thread(dead2);
        t1.start();
        t2.start();
    }
}

class Dead implements Runnable {
    static final Object o1 = new Object();
    static final Object o2 = new Object();
    public boolean flag;

    public Dead(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "2");
                }
            }

        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "4");
                }
            }

        }
    }
}
