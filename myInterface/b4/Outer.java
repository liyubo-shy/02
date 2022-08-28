package myInterface.b4;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/20/10:57
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
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
