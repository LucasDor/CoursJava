package TP6.EX4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseListenerTest implements MouseListener{

    @Override
    //Invoked when the mouse button has been clicked (pressed and released) on a component.
    public void mouseClicked(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE CLICKED");
    }

    @Override
    //Invoked when the mouse enters a component.
    public void mouseEntered(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE ENTERED");
    }

    @Override
    //Invoked when the mouse exits a component.
    public void mouseExited(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE EXITED");
    }

    @Override
    //Invoked when a mouse button has been pressed on a component.
    public void mousePressed(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE PRESSED");
    }

    @Override
    //Invoked when a mouse button has been released on a component.
    public void mouseReleased(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE RELEASED");
    }

    private void handleMouseEvent(MouseEvent mouseEvent, String s){
        System.out.println(s);
        System.out.println("POSITION : " + "(" + mouseEvent.getX() + ", " + mouseEvent.getY() +")");
    }
    
}
