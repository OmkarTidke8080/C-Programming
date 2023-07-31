package pack1;


public class SubtractionClass
{
    // instance variables
    double d1, d2;
    public SubtractionClass(double a, double b)
    {
       d1 = a;
       d2 = b;
    }

    public void subtract()
    {
        System.out.println("Subtraction = "+(d1-d2));
    }

}
