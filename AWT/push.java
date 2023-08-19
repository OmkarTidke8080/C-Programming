// Write a program that helps on creating 3 push buttons bearing the names of 3 color when a buttn is clicked, the color associated woth it is set a sbackgrounf color in the frame

import java.awt.*;
import java.awt.event.*;

public class push
{
  public static void main(String[] args)
  {
     MyButton mb = new MyButton();
     mb.setSize(400 ,400);
     mb.setTitle("My Button");
     mb.setVisible(true);98yt

  }   
}
class MyButton extends Frame implements ActionListener
{
    Button b1, b2, b3;

    MyButton()
    {
       // do not set any layou
       this.setLayout(null);

       // create 3 push buttons
       b1 = new Button("Yellow");
       b2 = new Button("Blue");
       b3 = new Button("Pink");

       // set the locations of buttons in the frame
       b1.setBounds(100, 100, 70, 40);
       b1.setBounds(100, 160, 70, 40);
       b1.setBounds(100, 220, 70, 40);

       this.add(b1);
       this.add(b2);
       this.add(b3);

       // close the frame
  addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
    }

    /// this method is calles when the buttonis clicked
    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();

        // change the frame background color depending on the button

        if(str.equals("Yellow"))  this.setBackground(Color.yellow);
        
        if(str.equals("Blue")) this.setBackground(Color.blue);
        
        if(str.equals("Pink"))  this.setBackground(Color.pink);
        
    }
}