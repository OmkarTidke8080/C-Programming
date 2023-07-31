// Write a program that shows the use of throw clause for throwing the NullPointer Exception

public class Program7
{
    public static void main(String args[])
    {
       Sample.demo();
    }   
}

class Sample
{
    static void demo()
    {
       try
       {
        System.out.println("Inside demo()");
        throw new NullPointerException("Exception data");
       }
       catch(NullPointerException ne)
       {
          System.out.println(ne);
       }
    }
}
