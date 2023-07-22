// write a program to show how to override the calculatebill() method of commercial class inside a Domestic class

import java.util.*;

public class extend
{
    public static void main(String arg[])
    {
       commercial c = new commercial();
       c.SetName("Omkar Tidke");
       c.calculatebill(150);
    
       regular d = new regular();
       d.SetName("Raj");
       d.calculatebill(100);

      
    }
}
class commercial
{
    // take customer name
    private String Name;
    
    // stor Customer name into instance variable name
    void SetName(String Name)
    {
        this.Name = Name;
    }

    // retrieve the name

    String getName()
    {
        return Name;
    }

    // calculate bill taking rs 5 per unit
    void calculatebill(int units)
    {
        System.out.println("Custome : "+getName());
        System.out.println("Bill Amount : "+ units * 5);
    }

    // electricity bill for Domestic customers

    class regular extends commercial
    {
        // over ride the calculate bill() method of commercial class 
        void calculate(int units)
        {
            System.out.println("Customer Name : "+ getName());
            System.out.println("Bill Amount : "+ units * 2.50);
        }
    }

}

