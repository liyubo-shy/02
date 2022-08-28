package reflection;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 *Field获取和修改字段的值
 * @Author: bo
 * @Date: 2022/08/23/8:19
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Reflection3 {

    public static void main(String[] args) throws Exception {
        Object p = new Person3("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        //name是private修饰的，调用Field.setAccessible(true)，一律允许访问。
        f.setAccessible(true);
        f.set(p,"DaMing");
        Object value = f.get(p);
        System.out.println(value); // "Xiao Ming"
    }
}

class Person3 {
    private String name;

    public Person3(String name) {
        this.name = name;
    }
}