import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;

class Person
{
    private String Name;
    private int Age;
  
    public void Accept()
    {
        // create scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        Name = sc.next();

        System.out.println("Enter Age in integer format");
        Age = sc.nextInt();
    }
   
    // to check wthethr the person is yong or adult
    public void Check()
    {
        if(Age < 18)
        {
            System.out.println("Person is Young");
        }
        else
        {
            System.out.println("person is adult");
        }
    }

}

public class Method
{
   public static void main(String arg[])
   { 
     Person obj = new Person();
     
     // Accept the name and age
     obj.Accept();
     
     // Check the age
     obj.Check();

   }
    
}
