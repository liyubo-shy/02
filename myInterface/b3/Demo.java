package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:26
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Demo {
    public static void main(String[] args) {
        TableTennisAthletes zhang = new TableTennisAthletes(22,"�ż̿�");
        TableTennisCoach liu = new TableTennisCoach(59,"������");
        BasketballAthletes ke = new BasketballAthletes(38,"�Ʊ�");
        BasketballCoach jie = new BasketballCoach(68,"�ܿ�ѷ");
        System.out.println(zhang.getName()+","+zhang.getAge());
        zhang.eat();
        zhang.learn();
        zhang.learnEnglish();
        System.out.println("-----------------------");
        System.out.println(liu.getName()+","+liu.getAge());
        liu.eat();
        liu.teach();
        liu.learnEnglish();
        System.out.println("-----------------------");
        System.out.println(ke.getName()+","+ke.getAge());
        ke.eat();
        ke.learn();
        System.out.println("-----------------------");
        System.out.println(jie.getName()+","+jie.getAge());
        jie.eat();
        jie.teach();
    }
}
