package myInterface.b5;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/26/10:26
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Demo {
    public static void main(String[] args) {
        JumO j = new JumO();
        j.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("������������");
            }
        });
    }
}
