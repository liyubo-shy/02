package reflection;

import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA.
 *Field获取字段
 * @Author: bo
 * @Date: 2022/08/23/7:52
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Reflection2 {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student2.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score").getName());
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name").getModifiers());
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade").getModifiers());
        System.out.println(Modifier.isPublic(1));
    }
}

class Student2 extends Person2 {
    public int score;
    private int grade;
}

class Person2 {
    public String name;
}
