package basictype.b7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/10/20:12
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Map01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"���ನ");
//      map.put(1,"���߷");//k�ظ��Ḳ��
        map.put(2,"����÷");
        map.put(3,"���ನ");//v���ظ� ��
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        Set<Integer> x = map.keySet();
        System.out.println(x);
        Collection<String> values = map.values();
        System.out.println(values);
    }
}

