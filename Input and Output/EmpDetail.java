// Accept Employee detail from user , empid , gender, name

import java.io.*;
public class EmpDetail
{
    public static void main(String arg[]) throws IOException
    {
       // create buffered reader object to accept input
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       // Accept employee details
       System.out.println("Enter Employee ID : ");
       int ID = Integer.parseInt(br.readLine());
   
       System.out.println("Enter Employee name : ");
       String Name = br.readLine();

       System.out.println("Gender (M/F) : ");
       char Gender = (char)br.read();

       // Displaying out put on scree

       System.out.println("ID = "+ID);
       System.out.println("Name  = "+Name);
       System.out.println("Gender = "+Gender);
    }
    
}
