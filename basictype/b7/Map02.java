package basictype.b7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/2:10
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Map02 {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student s1 = new Student("���ನ", 32, 100);
        Student s2 = new Student("��һ��", 42, 200);
        Student s3 = new Student("�����", 52, 1300);
        Student s4 = new Student("������", 62, 1040);
        map.put(1913829, s1);
        map.put(1913830, s2);
        map.put(1913831, s3);
        map.put(1913832, s4);
        for (Integer k : map.keySet()) {
            Student v = map.get(k);
            System.out.println("ѧ��:"  + k +","+ v);
        }
    }
}