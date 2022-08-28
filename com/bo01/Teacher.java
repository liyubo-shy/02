package com.bo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/1:44
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Teacher extends People {
    public void teacher() {
        System.out.println(getName() + "\n" + getAge() + "岁");
        System.out.println("老师来啦");
    }
}
