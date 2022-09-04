package multithread.b6;

/**
 * Created with IntelliJ IDEA.
 * 同步代码块
 *
 * @Author: bo
 * @Date: 2022/09/04/19:33
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Syn2 {
    public static void main(String[] args) {
        SellTicket2 sellTicket2 = new SellTicket2();
        Thread thread1 = new Thread(sellTicket2);
        Thread thread2 = new Thread(sellTicket2);
        Thread thread3 = new Thread(sellTicket2);

        thread1.setName("第一个窗口");
        thread2.setName("第二个窗口");
        thread3.setName("第三个窗口");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SellTicket2 implements Runnable {
    //定义票数100
    public int tickets = 30;
    //定义isRun用于停止线程
    public boolean isRun = true;

    //统计各个窗口的售票数
    public int count1 = 0;
    public int count2 = 0;
    public int count3 = 0;

    public void sell() throws InterruptedException {
        /*
         * @Author: bo
         * @Description: 使用synchronized同步代码块
         * @DateTime: 2022/9/4 4:06
         * @In []
         * @Return void
         */
        synchronized (this) {
            if (tickets != 0) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + "卖出第" + (30 - (tickets - 1)) + "张票" + "，剩余票数：" + (tickets - 1));
                //统计各个线程的执行次数
                if (Thread.currentThread().getName().equals("第一个窗口")) {
                    count1++;
                } else if (Thread.currentThread().getName().equals("第二个窗口")) {
                    count2++;
                } else {
                    count3++;
                }
                //售票后票数减1
                tickets--;
                //判断是否售空
                if (tickets == 0) {
                    //输出统计信息
                    System.out.println("已售空!!!");
                    System.out.println("-------------");
                    System.out.println("第一个窗口" + "售出" + count1 + "张票");
                    System.out.println("第二个窗口" + "售出" + count2 + "张票");
                    System.out.println("第三个窗口" + "售出" + count3 + "张票");
                    //修改变量，停止线程
                    isRun = false;
                }
            }
        }


    }

    @Override
    public void run() {
        while (isRun) {
            try {
                sell();//运行售票方法
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
