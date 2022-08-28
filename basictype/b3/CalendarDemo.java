package basictype.b3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/06/0:49
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入年份，显示当年的二月的天数：");
        int year = scan.nextInt();
        System.out.println(year);
        int februaryDays = CalendarDefine.getFebruaryDays(year);
        System.out.println(year + "年的二月有" + februaryDays + "天");
    }
}
