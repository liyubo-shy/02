package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/24/8:24
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Regex2 {
    public static void main(String[] args) {
        //定义规则模板
        Pattern pattern = Pattern.compile("([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])");
        Matcher matcher = pattern.matcher("23:59:59");
        if (matcher.matches()) {
            System.out.println("匹配成功！");
            System.out.println("输入的时间为:" + matcher.group(0));
            System.out.println("时:"+matcher.group(1));
            System.out.println("分:"+matcher.group(2));
            System.out.println("秒:"+matcher.group(3));
        } else {
            System.out.println("匹配失败");
        }

    }
}