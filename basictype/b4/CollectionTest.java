package basictype.b4;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/06/21:44
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(21,"���ನ","����");
        Student s2 = new Student(21, "��Сú", "ľ����");
        Student s3 = new Student(23, "���", "ï��");
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
