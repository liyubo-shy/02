package draw.b2;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/30/23:39
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class MyPanel2 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(0,0,300,300);
    }
}
