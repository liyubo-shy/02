package multithread.b1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/27/18:03
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Thread2 {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(() -> {
            System.out.println("thread run...");
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("thread end!");
        });
        t.start();
        System.out.println("main end!");
    }
}