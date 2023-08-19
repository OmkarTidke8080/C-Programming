// Write a program to close the frame using windowAdapter method


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    public static void main(String[] args)
    {
        // create a frame
        MyFrame f = new MyFrame();

        // set title for frame
        f.setTitle("MY Awt Frame");

        // set size
         f.setSize(300,250);

        // display the frame
        f.setVisible(true);

        //close the frame
        f.addwindowListener(new MyClass());
    }

    void addwindowListener(MyClass myClass) {
    }

    public void addWindowListener(windowAdapter windowAdapter) {
    }
}

class MyClass extends WindowAdapter
{
    public void windowClosing(windowEvent e)
    {
        System.exit(0);
    }
}