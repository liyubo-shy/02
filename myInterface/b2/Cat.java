package myInterface.b2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/19/14:45
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
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
        System.out.println("è����");
    }

    @Override
    public void jump() {
        System.out.println("è����");
    }
}
