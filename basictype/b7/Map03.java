package basictype.b7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/2:32
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Map03 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student s1 = new Student("���ನ", 32, 100);
        Student s2 = new Student("��һ��", 42, 200);
        Student s3 = new Student("�����", 52, 1300);
        Student s4 = new Student("������", 62, 1040);
        Student s5 = new Student("������", 62, 1412);
        Student s6 = new Student("������", 62, 1040);
        map.put(s1,"����");
        map.put(s2,"����");
        map.put(s3,"����");
        map.put(s4,"����");
        map.put(s5,"����");
        map.put(s6,"����");
        for (Student k : map.keySet()){
            System.out.println(k+",��ַ��"+map.get(k));
        }

    }
}
