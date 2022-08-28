package myInterface.b3;

import java.util.AbstractList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:20
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class BasketballAthletes extends Athletes {

    public BasketballAthletes(int age, String name) {
        super(age, name);
    }
    @Override
    public void learn() {
        System.out.println("学习篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃篮球");
    }
}
