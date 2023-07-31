// Write a program to understand how to achieve call back mechanism through interface method in java

import java.util.*;

public class Interface3
{
    public static void main(String args[]) throws Exception
    {
       // Accept the stat name through commmand line arguments
       Class c = Class.forName(args[0]);

       // create a new object to that class whose name is in c
       tax ref = (tax)c.newInstance();
       calculateTax(ref);
    }
    static void calculateTax(tax t)
    {
       // calculate central tax
       double ct = 1000;

       double st = t.stateTax();
       System.out.println("Total taxes = "+(ct+st));
    }
}
interface tax
{
    double stateTax();
}

// implementation class for Maharashtra State
class MH implements tax
{
    public double stateTax()
    {
        System.out.println("According to Maharashtra government rules");
        return 5000.0;
    }
}
class KN implements tax
{
    public double stateTax()
    {
        System.out.println("According to Karnatana Government rules");
        return 6000.00;
    }
}
