package basictype.b2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/05/23:17
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class DateUtils {
    private DateUtils (){}

    public static String toString(Date date, String format){
        SimpleDateFormat sdt = new SimpleDateFormat(format);
        return sdt.format(date);
    }
    public static Date toDate(String s1, String format) throws ParseException {
        SimpleDateFormat dfs = new SimpleDateFormat(format);
        return dfs.parse(s1);
    }
}
