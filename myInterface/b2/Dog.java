package myInterface.b2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/19/14:47
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("��������");
    }

    @Override
    public void jump() {
        System.out.println("��������");
    }
}
