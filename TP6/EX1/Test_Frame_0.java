package TP6.EX1;


import java.awt.*;
import javax.swing.*;

public class Test_Frame_0{
    public static void createAndShowGUI(){
        JFrame myFrame = new JFrame("Here is my first frame");
        myFrame.setPreferredSize(new Dimension(500,300));

        myFrame.pack();
        myFrame.setVisible(true);
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("myFrame: "+ myFrame.getSize());
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