package multithread.b2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/31/2:10
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Cat extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 90; i++) {
            System.out.println("我是" + i + "号小猫"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
