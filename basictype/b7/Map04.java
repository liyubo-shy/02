package basictype.b7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/2:41
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Map04 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        HashMap<String, String> hMap1 = new HashMap<>();
        hMap1.put("��һ��hashmap�ļ�", "��һ��hashmap��ֵ");
        arr.add(0, hMap1);

        HashMap<String, String> hMap2 = new HashMap<>();
        hMap1.put("�ڶ���hashmap�ļ�", "�ڶ���hashmap��ֵ");
        arr.add(1, hMap2);

        HashMap<String, String> hMap3 = new HashMap<>();
        hMap1.put("������hashmap�ļ�", "������hashmap��ֵ");
        arr.add(2, hMap3);

        for (HashMap<String, String> a : arr) {
            for (String k : a.keySet()) {
                String v = a.get(k);
                System.out.println("key:" + k + ",value:" + v);
            }
        }

    }

}
