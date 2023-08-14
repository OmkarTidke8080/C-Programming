// Write a program where the consumer thread checks whetehr the data production is over or not every 10 milliseconds

public class ThreadCommunicate
{
    public static void main(String[] args)
    {
        // Producer producs some data which consumer consumes
        Producer obj1 = new Producer();
        Consumer obj2 = new Consumer(obj1);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t2.start();
        t1.start();

    }
}
class Producer extends Thread
{
    //to add data we use string buffer object
    StringBuffer sb;

    // dataprodover will be trw when data production is over
    boolean dataprodover = false;

    Producer()
    {
        sb = new StringBuffer();
    }

    public void run() 
    {
        // go on appending data (numbers) to strng buffer
        for(int i = 0; i <= 10; i++)
        {
            try
            {
                sb.append(i+":");
                Thread.sleep(100);
                System.out.println("Appending");
            }
            catch(InterruptedException ei)
            {

            }

            // data prodction over 
            dataprodover = true;
        }
    }
}
class Consumer extends Thread
{
    // create producer reference to refer to prodcer object from consumer class

    Producer prod;

    Consumer(Producer prod)
    {
        this.prod = prod;
    }

    public void run()
    {
        // if data prodction is not over , sleep for 10 ms

        try
        {
            while( !prod.dataprodover)
            {
                Thread.sleep(10);
            }
        }
            catch(Exception e)
            {

            }
        
        System.out.println(prod.sb);
    }
}