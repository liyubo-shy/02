package basictype.b7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/11/2:32
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Map03 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student s1 = new Student("李余波", 32, 100);
        Student s2 = new Student("李一波", 42, 200);
        Student s3 = new Student("李二波", 52, 1300);
        Student s4 = new Student("李三波", 62, 1040);
        Student s5 = new Student("李三波", 62, 1412);
        Student s6 = new Student("李三波", 62, 1040);
        map.put(s1,"化州");
        map.put(s2,"化州");
        map.put(s3,"化州");
        map.put(s4,"化州");
        map.put(s5,"化州");
        map.put(s6,"化州");
        for (Student k : map.keySet()){
            System.out.println(k+",地址："+map.get(k));
        }

    }
}
