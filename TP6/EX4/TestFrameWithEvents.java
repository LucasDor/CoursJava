package EX4;

import java.awt.*;
import javax.swing.*;

public class TestFrameWithEvents {
    
    public static void main(String[] args){
        JFrame f = new JFrame("Test Event");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel un = new JLabel("move on me");
        JMenuBar bar = new JMenuBar();
        JMenuItem e1 = new JMenuItem("Salut :)");

        bar.add(e1);

        bar.setPreferredSize(new Dimension(200,30));

        un.setPreferredSize(new Dimension(100,100));
        un.setBackground(Color.orange);
        un.setOpaque(true);

        f.setJMenuBar(bar);;
        f.add(un);

        
        bar.addMouseListener(new MouseListenerTest());

        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
