import java.awt.*;
import java.awt.event.*;


class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String title)
    {
    
        fobj = new Frame(title);     
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
    }

    class MarvellousListener implements WindowListener
    {

        public void windowActivated(WindowEvent obj){}
        public void windowDeactivated(WindowEvent obj){}
        public void windowiconified(WindowEvent obj){}
        public void windowDeiconified(WindowEvent obj){}
        public void windowClosed(WindowEvent obj){}
        public void windowOpened(WindowEvent obj){}
        public void windowClosing(WindowEvent obj)
        {
            System.exit(0);

        }
        @Override
        public void windowIconified(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
        }


    }



 class GUI4
 {
    public static void main(String arg[])
    {
          MarvellousFrame mobj = new MarvellousFrame("PPA");
     }
    
}
