package basictype.b8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/20:05
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Show {
    public static void showPoker(ArrayList<String> arr) {
        Collections.sort(arr);
        System.out.println();
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.print(arr.size() + "张");

    }

    public static void showLast(ArrayList<String> arr) {
        System.out.print("底牌：");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}


