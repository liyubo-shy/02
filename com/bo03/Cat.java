package com.bo03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/17/0:51
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String name, String master) {
        super(age, name, master);
    }

    @Override
    public void eat() {
        System.out.println("è��è��");
    }

    public void coquettish(){
        System.out.println("è����");
    }
}
