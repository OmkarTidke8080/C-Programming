// Write a program to display some text in the frame using drawString() method

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener.*;

public class Text
{
    public static void main(String[] args)
    {
        Message m = new Message();
        m.setSize(400, 400);
        m.setTitle("This is my text");
        m.setVisible(true);
    }
    
}
class Message extends Frame
{
    Message()
    {
        // close the frame when close buttton clicked
          addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
    }


    public void paint(Graphics g)
    {
        // set background color for frame
        this.setBackground(new Color(100,20,20));
        
        // set fint for text
        Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
        g.setFont(f);

        // set foreground color
        g.setColor(Color.green);

        // display the messsage
        g.drawString("Hello, How are yoy?", 100, 100);
    }
}
