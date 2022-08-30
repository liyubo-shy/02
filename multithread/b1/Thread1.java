package multithread.b1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/27/18:01
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Thread1 {
    public static void main(String[] args) {
        Thread thr1 = new MyThread1();
        Thread thr2 = new MyThread2();
        thr1.start();
        thr2.start();

    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            System.out.println("1号线程："+i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            System.out.println("2号线程："+i);

        }
    }
}