
import java.lang.*;
import java.util.*;

class Person
{
    // instance variables
    String Name;
    int Age;

    Person()
    {
        Name = "Omkar";
        Age = 21;

    }
    void talk()
    {
        System.out.println("Hello my name is "+Name);
        System.out.println("My age is "+Age);
    }
}


public class Dconstructor
{
    public static void main(String arh[])
    {
        Person obj = new Person();
        obj.talk();

        Person obj1 = new Person();
        obj1.talk();
        
    }
    
}
