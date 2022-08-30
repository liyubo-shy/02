package draw.b2;


import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/30/23:38
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Draw2 extends JFrame {
    public Draw2(){
        MyPanel2 myPanel2 = new MyPanel2();
        this.add(myPanel2);
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
