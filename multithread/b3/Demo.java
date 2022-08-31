package multithread.b3;

/**
 * Created with IntelliJ IDEA.
 *一个线程每隔一秒输出hello world，输出10次，退出。一个线程1秒输出hi，输出5次退出。使用Runnable创建线程
 * @Author: bo
 * @Date: 2022/08/31/19:13
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Demo {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
