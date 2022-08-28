package basictype.b4;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/08/0:58
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student(13,"陈小煤","化州");
        Student s2 = new Student(13,"李余波","化州");
        Student s3 = new Student(13,"李余波","广州");
        Student s4 = new Student(13,"李余波","广州");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        for (Student s : hashSet){
            System.out.println(s);
        }


    }
}
