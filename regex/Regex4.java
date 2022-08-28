package regex;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/24/11:10
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Regex4 {
    public static void main(String[] args) {
        //替换
        String s1 = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
        String r1 = s1.replaceAll("\\s+", " ");
        System.out.println(r1); // "The quick brown fox jumps over the lazy dog."
        System.out.println("----------------------");

        //反向引用
        String s2 = "the quick brown fox jumps over the lazy dog.";
        String r2 = s2.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r2);
    }
}
