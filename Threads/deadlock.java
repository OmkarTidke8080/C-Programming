// Write a program depicting a situation in which a deadlock can occur

public class deadlock
{
    public static void main(String[] args)
    {
        Object train = new Object();
        Object Compartment = new Object();

        // create object to book ticket , cancel ticket classes

        BookTicket obj1 = new BookTicket(train, Compartment);
        CancelTicket obj2 = new CancelTicket(train, Compartment);

        // attch two thread to these objects

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
class BookTicket extends Thread
{
    // we are assuming train, compartment as objects
    Object train, Comp;

    BookTicket(Object train, Object Comp)
    {
        this.train = train;
        this.Comp = Comp;
    }
    public void run()
    {
        // lock on train
        synchronized(train)
        {
            System.out.println("BookTicekt locked on train...");

            try
            {
                Thread.sleep(150);
            }
            catch( InterruptedException ie)
            {

            }

            System.out.println("Book ticket is now waiting to lock on Compartment...");

            synchronized(Comp)
            {
                System.out.println("Book Ticket locked in Compartment...");
            }
        }
    }
}
class CancelTicket extends Thread
{
    // we are assuming train, compartment as objects
    Object train, Comp;

    CancelTicket(Object train, Object Comp)
    {
        this.train = train;
        this.Comp = Comp;
    }

    public void run()
    {
        // lock on compartment
        synchronized(Comp)
        {
           System.out.println("Cancelled ticket locked in compartment...");

           try
           {
            Thread.sleep(200);
           }
           catch(InterruptedException ei)
           {}

           System.out.println("Cancel Ticket now waiting to lock on train...");

           synchronized(train)
           {
             System.out.println("Cancelled ticket lock on train...");
           }
        }
    }
}
