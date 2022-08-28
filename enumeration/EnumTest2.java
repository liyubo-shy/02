package enumeration;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/22/8:48
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class EnumTest2 {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is " + day.name() + ". Work at home!");
        } else {
            System.out.println("Today is " + day.name() + ". Work at office!");
        }
    }
}

enum Weekday {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}

 class guid {
    /**
     * @param args
     */
    public static void main(String[] args) {
// TODO Auto-generated method stub
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
 }