// Write a program to create a frame by creating an object to the sub class of Frame class

import java.awt.*;

public class MyFrame2 extends Frame
{
     // call super class constructor to store title
        MyFrame2(String str)
        {
           super(str);
        }
    public static void main(String[] args)
    { 
        MyFrame2 f = new MyFrame2("My AWT Frame");

        // set size of the frame
        f.setSize(300,250);

        // display the frame
        f.setVisible(true);
       
         
    }
    
}
