package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:54
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class BasketballCoach extends Coach{
    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("������");
    }

    @Override
    public void eat() {
        System.out.println("�������������");
    }
}
