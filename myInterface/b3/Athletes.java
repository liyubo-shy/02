package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:51
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public abstract class Athletes extends People{
    public Athletes(){
    }
    public Athletes(int age, String name) {
        super(age, name);
    }
    public abstract void learn();
}
