package multithread.b2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/31/2:10
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我是主线程" + i);
            Thread.sleep(1000);
        }

    }
}
