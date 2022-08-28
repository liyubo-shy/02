package basictype.b1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/31/11:37
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Demo {
    public static void main(String[] args) {
        String s = "23 4 44 213 5554 331";
        System.out.println(s);

        String[] s1 = s.split(" ");
        int[] i1 = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            i1[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(i1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < i1.length; i++) {
            if (i == i1.length-1) {
                sb.append(i1[i]);
            } else {
                sb.append(i1[i]).append(" ");
            }
        }
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
