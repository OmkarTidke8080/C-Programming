// Write a program to draw a home with moon in the background

import java.awt.*;
import java.awt.event.*;

public class Draw2
{
  public static void main(String[] args)
  {
    Home h = new Home();

    // set size an title
    h.setSize(500,400);
    h.setTitle("My Home");

    // display the frake
    h.setVisible(true);
  }
}

class Home extends Frame
{
    Home()
    {
        this.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(windowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        // store x, y co ordinates in x[]  , y[]
        int x[] = {375,375,475};
        int y[] = {125,200,200};
        int n = 3;

        // set gray background color for frame
        this.setBackground(Color.gray);

        // set yellow color for rectangle
        g.setColor(Color.yellow);
        g.fillRect(300, 200, 150, 100);


        // set blue color for another rectangle - door
        g.setColor(Color.blue);
        g.fillRect(350, 210, 50, 60);

        // draa a line below the door
        g.drawLine(350, 280, 400, 280);

        // set dark for polygon roof
        g.setColor(Color.darkGray);
        g.fillPolygon(x, y, n);

        // set cyan color for oval - moon
        g.setColor(Color.cyan);
        g.fillOval(100, 100, 60, 60);
        
        //set green color for arcs
        g.setColor(Color.green);
        g.fillArc(50, 250, 150, 100, 0, 180);
        g.fillArc(150, 250, 150, 100, 0, 180);
        g.fillArc(450, 250, 150, 100, 0, 180);

        // draw a line - the bottom most line of drawing
        g.drawLine(50, 300, 600, 300);

        // display some text
        g.drawString("Happy Home", 275, 350);
    }
}