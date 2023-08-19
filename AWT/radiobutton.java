// Write a program that creates 2 radio buttons "Yes" and "No"

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.*;
import java.awt.*;

public class radiobutton
{
    public static void main(String[] args)
    {
        MyRadio mr = new MyRadio();
        mr.setTitle("My radio button");
        mr.setSize(400, 400);
        mr.setVisible(true);
    }
}
class MyRadio extends Frame implements ItemListener
{
    String msg = "";
    CheckboxGroup cbg;
    Checkbox y,n;

    MyRadio()
    {
        // set layout to flow layout
        setLayout(new FlowLayout());

        // create check box goup object
        y = new Checkbox("Yes", cbg, true);
        n = new Checkbox("No", cbg, true);

        // add the radio buttons
        add(y);
        add(n);
        
        // add item listener  to the radio buttons
        y.addItemListener(this);
        n.addItemListener(this);

        // close the frame
           addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
    }
     // this method gets called when a radio button is clicked
     public void itemStateChanged(ItemEvent ie)
     {
        repaint();
     }
     
    private void add(Checkbox y2)
    {

    }

     // display the selected radio channel
     msg = "Current Selection : ";
     msg+= cbg.getSelectedcheckbox().getLabel();
     g.drawString(msg,10,100);

}
