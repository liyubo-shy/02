package myInterface.b4;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:57
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Outer {
    private int a = 23;

    private class Inner{
        public void show(){
            System.out.println(a);
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();

    }

}
