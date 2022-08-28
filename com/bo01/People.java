package com.bo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/1:42
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class People {
    private int age;
    private String name;

    public People() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void haha(){
        System.out.println("hahahhah");
    }
}
