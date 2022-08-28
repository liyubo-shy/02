package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *我们获取到Matcher对象后，不需要调用matches()方法（因为匹配整个串肯定返回false）
 * 而是反复调用find()方法，在整个串中搜索能匹配上\\wo\\w规则的子串，并打印出来
 * @Author: bo
 * @Date: 2022/08/24/10:39
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Regex3 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog.wow!";
        Pattern p = Pattern.compile("\\wo\\w");
        Matcher m = p.matcher(s);
        //输出
        while (m.find()) {
            String sub = s.substring(m.start(), m.end());
            System.out.println(sub);
        }
    }
}
