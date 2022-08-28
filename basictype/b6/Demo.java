package basictype.b6;


import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/09/2:51
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
@SuppressWarnings({"all"})
public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = (o2.getChineseScore()+o2.getMathScore())
                        - (o1.getMathScore()+o1.getChineseScore());
                int num2 = num == 0? o1.getChineseScore() - o2.getChineseScore() :num;

                int num3 = num2 == 0? o1.getMathScore() - o2.getMathScore() : num2;

                return  num3 == 0? o1.getName().compareTo(o2.getName()): num3;
            }
        });
        Student s1 = new Student("liyubo", 98, 32);
        Student s2 = new Student("liyubo", 98, 32);
        Student s3 = new Student("kunkun", 98, 32);
        Student s4 = new Student("kunkun", 98, 35);
        Student s5 = new Student("liyubo", 98, 42);
        Student s6 = new Student("liyubo", 42, 32);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for (Student s : ts ){
            System.out.println(s);
        }
    }
}
