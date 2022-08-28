package basictype.b4;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/06/21:44
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(21,"李余波","化州");
        Student s2 = new Student(21, "陈小煤", "木根村");
        Student s3 = new Student(23, "恶霸", "茂名");
        students.add(s2);
        students.add(s1);
        students.add(s3);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s);
        }

    }
}
