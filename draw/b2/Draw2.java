package draw.b2;


import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/30/23:38
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Draw2 extends Frame {
    public Draw2(){
        MyPanel2 myPanel2 = new MyPanel2();
        this.add(myPanel2);
        this.setSize(800,800);
        this.setVisible(true);

    }
}