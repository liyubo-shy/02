package basictype.b4;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/08/0:58
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student(13,"��Сú","����");
        Student s2 = new Student(13,"���ನ","����");
        Student s3 = new Student(13,"���ನ","����");
        Student s4 = new Student(13,"���ನ","����");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        for (Student s : hashSet){
            System.out.println(s);
        }


    }
}
