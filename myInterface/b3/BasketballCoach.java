package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:54
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class BasketballCoach extends Coach{
    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃篮球");
    }
}
