package basictype.file;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/4:30
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
/**
采用递归来解决兔子问题
 */
public class RabbitUpgrade {
    public static void main(String[] args) {
        System.out.println(f(20));
    }
 
    public static int f (int n){
        /*
         * @Author: bo
         * @Description: 使用递归
         * @DateTime: 2022/8/12 19:53
         * @In [n]
         * @Return int
         */
        if (n ==1 || n == 2){
            return 1;
        }else {
            return f(n - 1) + f(n - 2);

        }
    }
}

