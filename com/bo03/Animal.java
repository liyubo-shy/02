package com.bo03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/17/0:44
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public abstract class Animal {
    private int age;
    private String name;
    private String  master;

    public Animal() {
    }

    public Animal(int age, String name, String master) {
        this.age = age;
        this.name = name;
        this.master = master;
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

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("睡觉");
    }
}
