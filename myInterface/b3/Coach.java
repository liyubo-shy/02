package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:48
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public abstract class Coach extends People{
    public Coach(){
    }
    public Coach(int age, String name) {
        super(age, name);
    }
    public abstract void teach();
}
