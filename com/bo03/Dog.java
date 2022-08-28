package com.bo03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/17/0:52
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name, String master) {
        super(age, name, master);
    }

    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }
    public void fix(){
        System.out.println("狗修沟");
    }
}
