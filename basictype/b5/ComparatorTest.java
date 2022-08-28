package basictype.b5;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/08/5:05
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
@SuppressWarnings({"all"})
public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("liyubo", 30);
        Student s2 = new Student("chenxiaomei ", 18);
        Student s3 = new Student("liyubo", 32);
        Student s4 = new Student("wahaha", 21);
        Student s5 = new Student("omg", 21);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s : ts){
            System.out.println(s);
        }
    }
}
