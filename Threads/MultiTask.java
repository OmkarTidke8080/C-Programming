// Write a progam shiowing thread working simultaneosly upon two objects
// program 5

public class MultiTask
{
    public static void main(String[] args)
    {
        // create two object to represent two task
        MyThread obj1 = new MyThread("Cut the Tickets");
        MyThread obj2 = new MyThread("Show th Seat");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
class MyThread implements Runnable
{
    String str;

    MyThread(String str)
    {
        this.str = str;
    }

    public void run()
    {
       for( int i = 0; i < 10; i++)
       {
         System.out.println(str +" : "+i);

         try
         {
            Thread.sleep(2000);
         }
         catch(InterruptedException IE)
         {
            IE.printStackTrace();
         }
       }
    }
}