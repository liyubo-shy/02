package basictype.b3;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/06/0:33
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class CalendarDefine {
    private CalendarDefine(){}
    public static int getFebruaryDays(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1 );
        calendar.add(Calendar.DATE,-1);
        return calendar.get(Calendar.DATE);
    }
}
