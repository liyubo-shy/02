package draw.b2;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/31/0:29
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Draw3 extends JFrame {
    public Draw3(){
        MyPanel3 myPanel3 = new MyPanel3();
        this.add(myPanel3);
        this.setSize(940,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
