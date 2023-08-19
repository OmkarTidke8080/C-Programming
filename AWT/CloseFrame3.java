// Write a program to close the frame using an anonymous inner class

import java.awt.*;
import java.awt.event.*;

public class CloseFrame3 extends Frame
{
    public static void main(String[] args)
    {
        // create a frame 
        MyFrame f = new MyFrame();

        // set a title for my frame
        f.setTitle("Close Frame");

        // set size
        f.setSize(400, 300);

        f.setVisible(true);

        f.addWindowListener( new windowAdapter()
        {
           public void windowClosing(windowEvent e)
           {
            System.exit(0);
           }
        });
        
    }
    
}
