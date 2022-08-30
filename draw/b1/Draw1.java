package draw.b1;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *老韩的第一个画图程序
 * @Author: bo
 * @Date: 2022/08/30/22:59
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Draw1 extends Frame{
    private MyPanel1 mp = null;

    public static void main(String[] args) {
        new Draw1();
    }

    public Draw1 (){
        mp = new MyPanel1();
        this.add(mp);
        this.setSize(800,800);
        this.setVisible(true);
    }
}

class MyPanel1 extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(0,0,600,600);
    }
}
