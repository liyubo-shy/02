package myInterface.b2;

import myInterface.b1.Jumping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/19/14:48
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat("god",232);
        Dog d = new Dog("shy",2);
        System.out.println("name:" + c.getName() + "," + "age:" + c.getAge());
        c.jump();
        c.eat();
        System.out.println("name:" + d.getName() + "," + "age:" + d.getAge());
        d.jump();
        d.eat();
    }
}
