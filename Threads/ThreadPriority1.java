// write a program to understand the thread priority 

public class ThreadPriority1
{
    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
    
        Thread t1 = new Thread(obj,"One");
        Thread t2 = new Thread(obj,"Two");

        // set priority for them
        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}
class MyClass extends Thread
{
    int count = 0;

    public void run()
    {
       for(int i = 0; i <= 50; i++)
       {
         count++;
         // display which thread has completed counting and its priority
         System.out.println("Completed thread : "+Thread.currentThread().getName());
         System.out.println("Its Priority is : "+Thread.currentThread().getPriority());

       }
    }

}