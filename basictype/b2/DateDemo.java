package basictype.b2;

import java.text.ParseException;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/05/23:27
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        String s1 = DateUtils.toString(d1,"yyyy-MM-dd HH:mm:ss");
        System.out.println(d1);
        System.out.println(s1);
        System.out.println("-----------------");
        String s2 = "2000-02-29 00:23:32";
        Date d2 = DateUtils.toDate(s2,"yyyy-MM-dd HH:mm:ss");
        System.out.println(s2);
        System.out.println(d2);
    }
}
