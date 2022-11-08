package TP6.EX2;

import java.awt.*;
import javax.swing.*;

public class TestDeco {
    public static void createAndShowGUI(){
        JFrame myFrame = new JFrame("Here is my deco frame");
        myFrame.setTitle("The magnifique decoration");
        myFrame.getContentPane().setBackground(Color.magenta);
        myFrame.setPreferredSize(new Dimension(500,300));

        JMenuBar bar = new JMenuBar();
        bar.setOpaque(true);

        JMenuItem Acceuil,Contact,Ressource;
        Acceuil = new JMenuItem("Acceuil");
        Contact = new JMenuItem("Contact");
        Ressource = new JMenuItem("Ressource");

        Acceuil.setBackground(Color.lightGray);
        Contact.setBackground(Color.lightGray);
        Ressource.setBackground(Color.lightGray);

        //menu.add(Acceuil);

        bar.add(Acceuil);
        bar.add(Contact);
        bar.add(Ressource);

        bar.setBackground(Color.blue);

        myFrame.setJMenuBar(bar);

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
