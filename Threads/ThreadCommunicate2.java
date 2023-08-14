// write a program such that consumer thread is informed immediately when the data production is over

public class ThreadCommunicate2
{
    public static void main(String[] args)
    { 
        // producer produces some data whcih consumer consumes
       Producer obj1 = new Producer();

       // pass producer object to consumer so that it is available to consumer
       Consumer obj2 = new Consumer(obj1);
       
       // create 2 thead to attach to producer and consumer
       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

       // run the thread
       t2.start();
       t1.start();
    }
    
}
class Producer extends Thread
{
    // to add data,  we use string buffer object
    StringBuffer sb;

    Producer()
    {
        sb = new StringBuffer();
    }

    public void run()
    {
        synchronized(sb)
        {
            // go on appending data(numbers) to string buffer
            for(int i = 0; i <= 10; i++)
            {
                try
                {
                    sb.append(i +" : ");
                    Thread.sleep(100);
                    System.out.println("Appending");
                }
                catch(Exception e)
                {

                }

            }
            sb.notify();
        }
    }
}
class Consumer extends Thread
{
    // create producer reference to refer object from consumer class
    Producer prod;

    Consumer(Producer prod)
    {
        this.prod = prod;
    }

    public void run()
    {
        synchronized(prod.sb)
        {
            try
            {
                // wait till a notification is received from producer
                prod.sb.wait();

            }
            catch(Exception e)
            {

            }

            System.out.println(prod.sb);
        }
    }
}