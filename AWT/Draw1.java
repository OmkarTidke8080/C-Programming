// Write a program to draw a smiling face using the methods of graphics class

import java.util.*;
import java.awt.*;
import java.awt.event.*;

 class Draw1 extends Frame
{
    Draw1()
    {
        this.addWindowListener( new windowAdapter() {
            public void windowClosing(windowEvent e)
            {
                System.exit(0);
            }
        });
    }

    private void addWindowListener(windowAdapter windowAdapter) {
    }

    public void paint(Graphics g)
    {
        // set blue color for drawing
        g.setColor(Color.black);

        // display a rectangle to contain a drawing
        g.drawRect(40,40, 200, 200);

        // face
        g.drawOval(90, 70, 80, 80);

        // eyes
        g.drawOval(100, 95, 5, 5);
         g.drawOval(145, 95, 5, 5);

         // nose
        g.drawLine(130, 95, 130, 115);

        // mouth
        g.drawArc(113,115,35,20,0,-180);

    }

    public static void main(String[] args) {
        Draw1 d = new Draw1();

        // set size and title
        d.setSize(400,400);

        d.setTitle("My Drawing");

        d.setVisible(true);
    }

}
