package multithread.b6;

/**
 * Created with IntelliJ IDEA.
 * 三个窗口同时买票，使用synchronized同步方法来解决超卖问题
 *
 * @Author: bo
 * @Date: 2022/09/04/1:07
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Syn {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread sell1 = new Thread(sellTicket);
        Thread sell2 = new Thread(sellTicket);
        Thread sell3 = new Thread(sellTicket);

        sell1.setName("第一个窗口");
        sell2.setName("第二个窗口");
        sell3.setName("第三个窗口");

        sell1.start();
        sell2.start();
        sell3.start();

    }
}


class SellTicket implements Runnable {
    //定义票数100
    public int tickets = 30;
    //定义isRun用于停止线程
    public boolean isRun = true;

    //统计各个窗口的售票数
    public int count1 = 0;
    public int count2 = 0;
    public int count3 = 0;

    public synchronized void sell() throws InterruptedException {
        /*
         * @Author: bo
         * @Description: 使用synchronized修饰方法，让该方法同一时间只允许被一个线程访问
         * @DateTime: 2022/9/4 4:06
         * @In []
         * @Return void
         */

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