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
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Map01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"李余波");
//      map.put(1,"李大叻");//k重复会覆盖
        map.put(2,"陈晓梅");
        map.put(3,"李余波");//v可重复 ；
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        Set<Integer> x = map.keySet();
        System.out.println(x);
        Collection<String> values = map.values();
        System.out.println(values);
    }
}

