// Write a program to create a frame by creating an object to Frame class

import java.util.*;
import java.awt.Frame;
import java.awt.event.*;

public class MyFrame1
{
    public static void main(String[] args)
    {
        
        // create a frame
        Frame f = new Frame("My Frame");

        // set the size of frame
        f.setSize(300, 250);

        // display the frame
        f.setVisible(true);

        //close the frame
        f.addWindowListener(new MyClass());
    }

  
}

class MyClass extends WindowAdapter
{
    public void windowClosing(windowEvent e)
    {
        System.exit(0);
    }
}