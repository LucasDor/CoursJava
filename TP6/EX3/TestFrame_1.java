package EX3;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class TestFrame_1 {
    
    public static void createAndShowGUI(){
        JFrame myFrame = new JFrame("Here is my second frame");
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().setBackground(new ColorUIResource(110,50,255));
        myFrame.setPreferredSize(new Dimension(500,300));        

        JLabel myLabel = new JLabel("Do you here me ? I say Hello !");
        myFrame.getContentPane().add(myLabel);
        myLabel.setSize(new Dimension(164, 20));
        myLabel.setForeground(new ColorUIResource(0,120,0));
        myLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));

        myLabel.setHorizontalAlignment(JLabel.CENTER);
        myLabel.setVerticalAlignment(JLabel.CENTER);

        System.out.println("myLabel: "+ myLabel.getPreferredSize());
        System.out.println("myFrame: "+ myFrame.getPreferredSize());
        

        myFrame.pack();
        myFrame.setVisible(true);
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
}
