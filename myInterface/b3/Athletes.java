package myInterface.b3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/9:51
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public abstract class Athletes extends People{
    public Athletes(){
    }
    public Athletes(int age, String name) {
        super(age, name);
    }
    public abstract void learn();
}
