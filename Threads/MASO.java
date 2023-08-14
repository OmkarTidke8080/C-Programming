// multiple threads acting in single object
// Write a program showing two threads acring upon single object

public class MASO
{
    public static void main(String[] args)
    {
        // tell that one berth is needed
        Reserve obj = new Reserve(1);

        // attch first thread to the object
        Thread t1 = new Thread(obj);

        // attach second thread to the same object
        Thread t2 = new Thread(obj);

        // take the thread name s as oerson names
        t1.setName("First Person");
        t2.setName("Second person");

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
        // display available berth
        System.out.println("Available berths are : "+available);

        // if available berths are more then wanted
        if(available >= wanted)
        {
            String name = Thread.currentThread().getName();

            // allot berth to him
            System.out.println(wanted +" Berths reserved for " +name );

            try
            {
                Thread.sleep(1500);
                available = available - wanted;
            }
            catch(InterruptedException ie)
            {

            }
        }
        else
        {
            System.out.println("Sorry no berths...");
        }
     }
}