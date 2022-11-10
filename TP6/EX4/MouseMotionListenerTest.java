package EX4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerTest implements MouseMotionListener{
    
    @Override
    public void mouseDragged(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE DRAGGED");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent){
        this.handleMouseEvent(mouseEvent,"MOUSE MOVED");
    }

    private void handleMouseEvent(MouseEvent mouseEvent, String s){
        System.out.println(s);
        System.out.println("POSITION : " + "(" + mouseEvent.getX() + ", " + mouseEvent.getY() +")");
    }
}
