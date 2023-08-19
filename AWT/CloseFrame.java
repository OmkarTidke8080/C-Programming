// Write a program which first creates a frame and then closes it on clicking the close button

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class CloseFrame extends Frame
{
    public static void main(String[] args)
    {
       // create a frame
       MyFrame f = new MyFrame();

       f.setTitle("My AWT Frame");

       // set the size
       f.setSize(300,250);

       // display the frame
       f.setVisible(true);

       // close the frame
       f.addwindowListener(new MyClass());
    }
}

class MyClass implements WindowListener
{
    public void windowActivated(windowEvent e)
    {}
    public void windowClosed(windowEvent e)
    {}

    public void windowClosing(windowEvent e)
    { 
        System.exit(0);
    }

    public void windowDeactivated(windowEvent e)
    {}

    public void windowDeiconified(windowEvent e)
    {}

    public void windoeIconified(windowEvent e)
    {}

    public void windowOpened(windowEvent e)
    {}
    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }
    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }
    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }
  
   
}

