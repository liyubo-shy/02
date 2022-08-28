package myInterface.b2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/19/14:47
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃蚊子");
    }

    @Override
    public void jump() {
        System.out.println("狗不会跳");
    }
}
