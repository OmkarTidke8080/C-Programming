// Write a program to create 3 check boxes to display bold, italic, and underlines

import java.awt.*;
import java.awt.event.*;
import java.awt.Container.*;

public class checkbox
{
  public static void main(String[] args) throws Exception
  {
     MyCheckbox mc = new MyCheckbox();

     mc.setSize(400, 400);
     mc.setTitle("MY checkbox");
     mc.setVisible(true);
  }   
}
class MyCheckbox extends Frame implements ItemListener
{
   String msg = "";
   Checkbox c1,c2,c3;

   MyCheckbox()
   {
       // set flow layout manager
       setLayout(new FlowLayout());

       // display 3 check boxes
       c1 = new Checkbox("BOLd", true);
       c1 = new Checkbox("italic");
       c1 = new Checkbox("underline");

       // add check boxec to the frame
       add(c1);
       add(c2);
       add(c3);

       // add item listener
       c1.addItemListener(this);
        c2.addItemListener(this);
       c3.addItemListener(this);

       // close the frame
         addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
   }
   // this method is called when the user clicks on check box

   public void itemStateChanged(ItemEvent ie)
   {
     repaint();
   }

   // display current state of check boxes
   public void paint(Graphics g)
   {
     g.drawString("Current State", 10, 100);
     msg = "Bold :"+c1.getState();

     g.drawString(msg, 10, 120);
     msg = "Italic : "+c2.getState();

     g.drawString(msg, 10, 140);
     msg = "Underline : "+c3.getState();
     g.drawString(msg, 10, 160 );

   }

}