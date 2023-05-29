import java.awt.*;
import java.awt.event.*;

class Calculator1
{
  public static void main(String arg[])
  {
    MarvellousCalculator mobj = new MarvellousCalculator(400,400,"Marvellous");

  }
}
class MarvellousCalculator extends WindowAdapter
{
  public Frame fobj;
  public Button b1,b2,b3,b4;
  public TextField t1,t2;
  public Label lobj;

  public MarvellousCalculator(int width, int height, String title)
  {
    fobj = new Frame(title);
    fobj.setSize(width,height);

    fobj.addWindowListener(this);

    b1 = new Button("Add");
    b2 = new Button("sub");
    b3 = new Button("mult");
    b4 = new Button("div");
    
    fobj.add(t1);
    fobj.add(t2);

    lobj = new Label();
    lobj.setBounds(150,25,200,100);
    fobj.add(lobj);

    fobj.setLayout(null);
    fobj.setVisible(true);
  }

  public void windowClosing(WindowEvent obj)
  {
    System.exit(0);
  }

}
