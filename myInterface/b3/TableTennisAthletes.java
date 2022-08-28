package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:24
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class TableTennisAthletes extends Athletes implements LearnEnglish{
    public TableTennisAthletes(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("学乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("乒乓球运动员学英语");
    }
}
