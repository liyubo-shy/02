package multithread.b5;

/**
 * Created with IntelliJ IDEA.
 *守护线程
 * @Author: bo
 * @Date: 2022/09/04/0:14
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        Chat chat = new Chat();
        Thread thread = new Thread(chat);
        thread.setDaemon(true);     //设置线程为守护线程嘻嘻
        thread.start();


        //循环5次后结束主线程，所有用户线程结束守护线程也就结束
        for (int i = 0; i < 5; i++) {
            System.out.println("老师在办公室喝茶");
            Thread.sleep(1000);
        }

        System.out.println("老师喝完茶了，现在去教室");
    }
}


class Chat implements Runnable{
    @Override
    public void run() {
        for (;;){
            System.out.println("学生在叽叽喳喳的聊天。。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}