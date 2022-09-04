package multithread.b8;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * 线程持续输出1-100随机数，直到线程2的scanner获取到q或Q,才停止两个线程
 *
 * @Author: bo
 * @Date: 2022/09/05/2:22
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class work1 {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        InPut inPut = new InPut();

        Thread thread1 = new Thread(printNum);
        Thread thread2 = new Thread(inPut);

        thread1.start();
        thread2.start();
    }
}

class PrintNum implements Runnable {
    private static boolean flag = true;

    public static boolean getFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        PrintNum.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class InPut implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("Q") || s.equals("q")) {
                PrintNum.setFlag(false);
                break;
            }
        }

    }
}
