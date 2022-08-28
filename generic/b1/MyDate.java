package generic.b1;

import java.time.Year;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/28/15:13
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public MyDate() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int j = year - o.getYear();
        if (j != 0){
            return j;
        }

        int k = month - o.getMonth();
        if (k != 0){
            return k;
        }

        return day - o.getDay();
    }
}
