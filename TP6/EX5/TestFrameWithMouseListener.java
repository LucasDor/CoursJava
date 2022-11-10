package EX5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class TestFrameWithMouseListener {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel l = new JLabel("Wesh michel");
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setPreferredSize(new Dimension(100,10));
        l.setBackground(Color.orange);
        l.setOpaque(true);
        
        l.addMouseWheelListener(new MouseWheelListenerTest());
        f.add(l);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
}
