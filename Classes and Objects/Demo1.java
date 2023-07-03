import java .util.*;
import java.lang.*;

  class Person
{
    // initialise instance variables
    private  String Name = "Omkar";
    private int Age = 21;

    void talk()
    {
        System.out.println("Hello I am "+ Name);
        System.out.println("My age is "+ Age);

    }
}
 class Demo1
{
    public static void main(String arg[])
    {
       // creating person class object :
       Person obj = new Person();
       obj.talk();

       // create another person clas object :
       Person obj1 = new Person();
       obj1. talk();

    }
}
