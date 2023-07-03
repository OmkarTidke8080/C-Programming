// Write a program to create a peron class and object Raju to person class 

import java.io.IOException;
import java.lang.*;
import java.util.*;

  public class Demo
{
    public static void main(String args[]) throws IOException
    {
       Person Raju = new Person();
       Raju.Name = "Raju";
       Raju.Age = 20;

       Raju.talk();
       
    }
}

  class Person
{
    public  
    String Name ;
    int Age;

    void talk()
    {
        System.out.println("Hello I am "+Name);
        System.out.println("My age is "+Age);
    }
}
