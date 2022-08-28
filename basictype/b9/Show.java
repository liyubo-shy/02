package basictype.b9;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/0:10
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Show {
    public static void showPoker(TreeSet<Integer> ts , HashMap<Integer,String> hm ){
        /*
         * @Author: bo
         * @Description: 显示牌
         * @DateTime: 2022/8/12 19:52
         * @In [ts, hm]
         * @Return void
         */
        for (Integer s : ts){
            System.out.print("["+hm.get(s)+"]"+" ");
        }
        System.out.println();
    }
}
