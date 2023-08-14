// Write a program to find the thread by JVM to execute the statements
// program1
import java.util.*;


public class CreateThread
{
    public static void main(String[] args)
    {
        System.out.println("CUrrent  thread is : ");
        Thread t = Thread.currentThread();
        System.out.println(" Thread is : "+t);
        System.out.println("Name  of thread is : "+t.getName());
        
    }
}