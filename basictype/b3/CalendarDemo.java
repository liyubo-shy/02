package basictype.b3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/06/0:49
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������ݣ���ʾ����Ķ��µ�������");
        int year = scan.nextInt();
        System.out.println(year);
        int februaryDays = CalendarDefine.getFebruaryDays(year);
        System.out.println(year + "��Ķ�����" + februaryDays + "��");
    }
}
