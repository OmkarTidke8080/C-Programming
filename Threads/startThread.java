// Write a program to create MyThread class with run() method and then attach a thread to this MyThread class object
//program 2

public class startThread
{
    public static void main(String[] args)
    {
        MyThread obj = new MyThread();

        // create a thread and attach it to the object of MyThread class
        Thread t = new Thread(obj);

        // now run the thread on object
        t.start(); // this code will execute the cod einside the run method of myThread class
    }
    
}
class MyThread extends Thread
{
    public void run()
    {
         //only this code is executed by the thread
         for(int i = 0; i < 10000; i++)
         {
            System.out.println(i);
         }
    }
}