package multithread.b4;

/**
 * Created with IntelliJ IDEA.
 *线程插队方法:join
 * @Author: bo
 * @Date: 2022/09/03/19:53
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        /*
         * @Author: bo
         * @Description: 开启子线程并让其插队
         * @DateTime: 2022/9/3 20:07
         * @In [args]
         * @Return void
         */
        JoinTest joinTest = new JoinTest();
        joinTest.start();
        for (int i = 0; i < 20; i++) {
            if (i == 5){
                joinTest.join();//让子线程插队
            }
            System.out.println("hi");
            Thread.sleep(1000);
        }
    }
}


class JoinTest extends Thread{
    @Override
    public void run() {
        /*
         * @Author: bo
         * @Description: 每秒输出一次hello，输出20次
         * @DateTime: 2022/9/3 20:07
         * @In []
         * @Return void
         */
        for (int i = 0; i < 20; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
