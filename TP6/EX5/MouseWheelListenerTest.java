package EX5;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelListenerTest implements MouseWheelListener{

    //Invoked when the mouse wheel is rotated.
    @Override
    public void mouseWheelMoved(MouseWheelEvent event)
    {
        if (event.getWheelRotation() < 0) 
        {
            System.out.println("WHEEEEEEEEEEE Up");
        } 
        else {
            System.out.println("WHEEEEEEEEEEE Down");
        }
    }
}
