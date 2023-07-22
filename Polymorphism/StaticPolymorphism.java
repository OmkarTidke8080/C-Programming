// Write a program to use super class reference to call the calculate method

public class StaticPolymorphism
{
    public static void main(String args[])
    {
        // super class references to sub class
       One o = new Two();

       // call calculate() method using super class
       o.calculate(25);
    }
    
}

class One
{
    // method to calculate square
    static void calculate(double x)
    {
        System.out.println("Square is : "+ (x * x));
    }
}
class Two extends One
{
    // method to calculate square root
    static void calculate(double x)
    {
        System.out.println("Square root is : "+ Math.sqrt(x));
    }
}