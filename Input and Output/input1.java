// Readding input with java.util.Scanner Class
// Write a program to accept employee details


import java.util.*;

public class input1
{
    public static void main(String arg[])
    {

        System.out.println("Enter ID , Name , Salary : ");
        Scanner sc = new Scanner(System.in);

        
        int id = sc.nextInt();
        String Name = sc.nextLine();
        float Salary = sc.nextFloat();

        System.out.println("ID ="+ id);
        System.out.println("Name = "+Name);
        System.out.println("Salary = "+Salary);

        sc.close();

    }

    

   
    
}
