package com.bo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/1:47
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class demon {
    public static void main(String[] args) {
        Teacher zhang = new Teacher();
        zhang.setAge(20);
        zhang.setName("����");
        zhang.teacher();

        Student li = new Student();
        li.setAge(18);
        li.setName("���߷");
        li.student();

        People a = new Student();
        a.setName("1231");
        a.getName();
        a.haha();
    }
}
