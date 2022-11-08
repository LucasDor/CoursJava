package TP6.EX4;

import java.awt.*;
import javax.swing.*;

public class TestFrameWithEvents {
    
    public static void main(String[] args){
        JFrame f = new JFrame("Test Event");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel un = new JLabel("move on me");

        un.setPreferredSize(new Dimension(100,100));
        un.setBackground(Color.orange);
        un.setOpaque(true);

        f.add(un);

        un.addMouseListener(new MouseListenerTest());

        f.pack();
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
}
