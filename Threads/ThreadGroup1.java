// Write a program to demonstrate the creation of thread groups and methods which act upon thread groups

public class ThreadGroup1
{
    public static void main(String[] args) throws Exception
    {
        // following statements are executed by main thread

        Reservation res = new Reservation();

        Cancellation can = new Cancellation();

        // create thread group with name
        ThreadGroup tg = new ThreadGroup("First Group");

        // create 2 threads and add them to first group
        Thread t1 = new Thread(tg, res, "First thread");
        Thread t2 = new Thread(tg, res, "Secong thread");

        // create anither thread thread group tg1 as a child to tg
        ThreadGroup tg1 = new ThreadGroup(tg,"Second Group");

        // create 2 thread and add them to second group
         Thread t3 = new Thread(tg1, res, "Third thread");
        Thread t4 = new Thread(tg1, res, "Fourth thread");

        // find parent group of tg1 
        System.out.println("Parent of tg1 : "+tg1.getParent());

        // set max priority to tg1 as 7
        tg1.setMaxPriority(7);
        
        System.out.println("Threa Group of t1="+ t1.getThreadGroup());
        System.out.println("Thread Group of t3= "+t3.getThreadGroup());

        t1.start();
        t2.start();
        t3.start();
        t3.start();

        System.out.println("No of threads active : "+tg.activeCount());


        
    }
}
class Reservation extends Thread
{
    public void run()
    {
        System.out.println("I am reservation thread...");
    }
}

class Cancellation extends Thread
{
    public void run()
    {
        System.out.println("I am Cancellation thread...");
    }
}
