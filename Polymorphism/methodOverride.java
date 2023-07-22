// write a pogram where calculate() method of super class is overridden by the caluculate() method of sub class. the behavior of calculate() methid is dynamically decide

public class methodOverride
{
    public static void main(String args[])
    {
       Two t = new Two();
       t.calculate(64);
    }
    
}
class One
{
    // method to calculate square value
    void calculate(double x)
    {
        System.out.println("Square is : "+ (x * x));
    }
}

class Two extends One
{
    // method to calculate Square root
    void calculate(double x)
    {
        System.out.println("Square root is : "+ Math.sqrt(x));
    }
}