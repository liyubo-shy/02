package myInterface.b3;

import java.util.AbstractList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:20
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class BasketballAthletes extends Athletes {

    public BasketballAthletes(int age, String name) {
        super(age, name);
    }
    @Override
    public void learn() {
        System.out.println("ѧϰ����");
    }

    @Override
    public void eat() {
        System.out.println("�����˶�Ա������");
    }
}
