package com.bo03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/17/0:51
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String name, String master) {
        super(age, name, master);
    }

    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void coquettish(){
        System.out.println("猫撒娇");
    }
}
