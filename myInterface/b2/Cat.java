package myInterface.b2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/19/14:45
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Cat extends Animal implements Jumpping{

    public int a = 3;
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃你");
    }

    @Override
    public void jump() {
        System.out.println("猫跳跳");
    }
}
