package TP6.EX1;

import java.awt.*;
import javax.swing.*;

public class TestFrames{
    public static void createAndShowGUI(){
        JFrame myFrame = new JFrame("Here is my first frame");
        JFrame Frame = new JFrame("Here is my second frame");

        Frame.setPreferredSize(new Dimension(600,600));
        myFrame.setPreferredSize(new Dimension(500,200));

        Frame.pack();
        myFrame.pack();

        Frame.setVisible(true);
        myFrame.setVisible(true);

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        System.out.println("myFrame: "+ myFrame.getSize());

        Frame.setLocation(0, 0);
        myFrame.setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
}    