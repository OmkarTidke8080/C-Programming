import java.lang.*;
import java.util.*;

class Person
{
    String Name;
    int Age;

    Person()
    {
        Name = "Omkar";
        Age = 21;
    }
    Person(String  S,int  I)
    {
       Name = "Raju";
       Age = 22;
    }
     void talk()
    {
        System.out.println("My Name is : "+Name);

        System.out.println("My Age is : "+Age);
    }
}

public class Pconstructor
{
    public static void main(String args[])
    {
      Person obj = new Person();
      obj.talk();

      Person obj1 = new Person("Sita", 22);
      obj1.talk();
    }
}
