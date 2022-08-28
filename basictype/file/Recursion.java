package basictype.file;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/20:01
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursion(12));
    }
    public static long recursion(long a ){
        /*
         * @Author: bo
         * @Description: 阶乘
         * @DateTime: 2022/8/12 21:48
         * @In [a]
         * @Return int
         */
        if (a == 1){
            return 1;
        }else {
            return a * recursion(a-1);
        }
    }

}
