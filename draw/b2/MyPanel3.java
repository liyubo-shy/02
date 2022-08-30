package draw.b2;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/31/0:24
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class MyPanel3 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/微信图片_20210319214955.jpgg"));
        g.drawImage(image,910,480,this);
    }
}
