package com.bo03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/17/0:52
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name, String master) {
        super(age, name, master);
    }

    @Override
    public void eat() {
        System.out.println("���Թ���");
    }
    public void fix(){
        System.out.println("���޹�");
    }
}
