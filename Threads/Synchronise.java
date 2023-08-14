// Write a program to synchronise the threads acting on the same object. the synchronised block in the program can be executed by only on thread at a time


public class Synchronise
{
    public static void main(String[] args)
    {
        Reserve obj = new Reserve(1);

        Thread t1 = new Thread(obj);

        Thread t2 = new Thread(obj);

        t1.setName("First Person");
        t2.setName("Second Person");

        t1.start();
        t2.start();
    }    
}
class Reserve implements Runnable
{
    // available berths are 1
    int available = 1;
    int wanted;

    Reserve(int i)
    {
        wanted = i;
    }

    public void run()
    {
        synchronized(this) // synchronise the current object    
        {
           // display avaialbel berths

           System.out.println("Availabe berths : "+available);

           if(available >= wanted)
           {
             String name = Thread.currentThread().getName();

             System.out.println(wanted +" Berths reseved for "+ name);

             try
             {
                Thread.sleep(1500);
                available = available - wanted;
             }
             catch(InterruptedException ie)
             {

             }
           }
        }
    }
}