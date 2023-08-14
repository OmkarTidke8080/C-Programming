// Write a program showing execution of multiple tasks with single thread
// program 4

public class SingleTask
{
    public static void main(String[] args)
    {
       //create an object to mythread clas
       MyThread obj = new MyThread();

       Thread t1 = new Thread(obj);
       t1.start();
    }
}
class MyThread implements Runnable
{
    public void run()
    {
        // execute the task one by ine by calling the methods
        task1();
        task2();
        task3();
    }
    void task1()
    {
        System.out.println("This is task 1");
    }
    void task2()
    {
        System.out.println("This is task 2");
    }
    void task3()
    {
        System.out.println("This is task 3");
    }
}