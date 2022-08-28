package basictype.file;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/4:12
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */

/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子
假如兔子都不死，问第二十个月的兔子对数为多少?
 */
public class Rabbit {
    public static void main(String[] args) {

        int sum = 0;
        int tem;
        int tem1 = 1;
        int tem2 = 1;
        for (int i = 3; i < 21; i++) {
            sum = tem1+tem2;
            tem = tem2;
            tem2= sum;
            tem1= tem;
        }
        System.out.println(sum );
    }
}
