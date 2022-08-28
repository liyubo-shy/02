package basictype.b7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/2:41
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Map04 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        HashMap<String, String> hMap1 = new HashMap<>();
        hMap1.put("第一个hashmap的键", "第一个hashmap的值");
        arr.add(0, hMap1);

        HashMap<String, String> hMap2 = new HashMap<>();
        hMap1.put("第二个hashmap的键", "第二个hashmap的值");
        arr.add(1, hMap2);

        HashMap<String, String> hMap3 = new HashMap<>();
        hMap1.put("第三个hashmap的键", "第三个hashmap的值");
        arr.add(2, hMap3);

        for (HashMap<String, String> a : arr) {
            for (String k : a.keySet()) {
                String v = a.get(k);
                System.out.println("key:" + k + ",value:" + v);
            }
        }

    }

}
