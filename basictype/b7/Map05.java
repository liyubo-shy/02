package basictype.b7;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/3:22
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Map05 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("1@1");
        arr1.add("1@2");
        arr1.add("1@3");
        arr1.add("1@4");
        arr1.add("1@5");
        map.put("one", arr1);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("2@1");
        arr2.add("2@2");
        arr2.add("2@3");
        arr2.add("2@4");
        arr2.add("2@5");
        map.put("two", arr2);

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("3@1");
        arr3.add("3@2");
        arr3.add("3@3");
        arr3.add("3@4");
        arr3.add("3@5");
        map.put("three", arr3);

        for (String k : map.keySet()) {
            System.out.println("key:" + k + ",v:" + map.get(k));
        }

    }
}
