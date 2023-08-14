// write a program showing how to terminate the thread by pressing enter button
// program 3

import java.io.*;

public class TerminateThread
{
    public static void main(String[] args) throws IOException
    {
       MyThread obj = new MyThread();

       Thread t = new Thread(obj);

       t.start();

       // stop when enter is pressed
       System.in.read(); // wait till enter is pressed
       obj.stop = true;
    }
}
class MyThread extends Thread
{
    boolean stop = false;

    public void run()
    {
        for(int i = 0; i < 50; i++)
        {
            System.out.println(i);
            if(stop)
            {
                return;
            }
        }
    }
}