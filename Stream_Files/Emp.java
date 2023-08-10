// Write a java program to create e employee class whose objects are to be stored into a file

import java.util.*;


import java.io.*;

public class Emp
{
  public static void main(String[] args) {
    
  }
}

class Employee implements Serializable
{
    int id;
    String Name;
    float Salary;
    Calendar doj;

    void DisplayData()
    {
        int yy = doj.get(Calendar.YEAR);
        int mm = doj.get(Calendar.MONTH);
        mm++;
        int dd = doj.get(Calendar.DATE);

        System.out.printf(" % -10d %s %10.2f %2d-%2d-%4\n",id,Name, Salary, dd,mm,yy);
    }

    void getData() throws IOException
    {
        // read data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ENter Employee id : ");
        id = Integer.parseInt(br.readLine());

        System.out.println("Enter Name of Employee : ");
        Name = br.readLine();

        System.out.println("Enter Salary : ");
        Salary = Float.parseFloat(br.readLine());

        System.out.println("ENter date of joining : ");
        System.out.println("Enter day :");
        int dd = Integer.parseInt(br.readLine());

        System.out.println("Enter month : ");
        int mm = Integer.parseInt(br.readLine());
        mm--;

        System.out.println("Enter Year : ");
        int yy = Integer.parseInt(br.readLine());

        // store date of joining into calendar object
        doj = Calendar.getInstance();
        doj.set(yy,mm,dd);
    }
}

