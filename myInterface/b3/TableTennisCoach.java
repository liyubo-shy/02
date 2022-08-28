package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:56
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class TableTennisCoach extends Coach implements LearnEnglish{
    public TableTennisCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
