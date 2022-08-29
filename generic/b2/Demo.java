package generic.b2;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/29/18:30
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Demo {
    public static void main(String[] args) {


    }

    @Test
    public void testList(){
        Dao<User> dao = new Dao<>();

        User user1 = new User(1, 29, "李余波");
        User user2 = new User(2, 29, "李小波");
        User user3 = new User(3, 29, "李大波");

        dao.save("第一个波",user1);
        dao.save("第二个波",user2);
        dao.save("第三个波",user3);

        dao.update("第一个波",new User(1,99,"大聪明"));

        dao.delete("第二个波");

        List<User> result = dao.list();
        System.out.println(result);
    }
}
