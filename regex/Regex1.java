package regex;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/23/9:37
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Regex1 {
    public static void main(String[] args) {
        String regex = "我唉\\d\\d";
        String str1 = "我唉21";
        String str2 = "我爱21";
        boolean r1 = str1.matches(regex);
        boolean r2 = str2.matches(regex);
        System.out.println(r1);//true
        System.out.println(r2);//false
    }
}

class test{
    public static void main(String[] args) {
        String re1 = "abc";
        System.out.println("abc".matches(re1));//true
        System.out.println("Abc".matches(re1));//false
        System.out.println("abcd".matches(re1));//false

        String re2 = "a&c"; // 对应的正则是a\&c
        System.out.println("a&c".matches(re2));//true
        System.out.println("a-c".matches(re2));//false
        System.out.println("a&&c".matches(re2));//false
    }
}
