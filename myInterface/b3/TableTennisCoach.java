package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:56
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class TableTennisCoach extends Coach implements LearnEnglish{
    public TableTennisCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("��ƹ����");
    }

    @Override
    public void eat() {
        System.out.println("ƹ���������ƹ����");
    }

    @Override
    public void learnEnglish() {
        System.out.println("ƹ�������ѧӢ��");
    }
}
