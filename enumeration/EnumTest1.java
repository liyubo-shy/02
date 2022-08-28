package enumeration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/22/8:20
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class EnumTest1 {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}
enum Weekday1 {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}