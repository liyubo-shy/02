package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:24
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class TableTennisAthletes extends Athletes implements LearnEnglish{
    public TableTennisAthletes(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("ѧƹ����");
    }

    @Override
    public void eat() {
        System.out.println("ƹ�����˶�Ա��ƹ����");
    }

    @Override
    public void learnEnglish() {
        System.out.println("ƹ�����˶�ԱѧӢ��");
    }
}
