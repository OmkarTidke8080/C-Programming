// Step 1 : creating a package pack with addition class

package pack; // pack is the package name

public class AdditionClass
{
    // instance variables
    double d1, d2;

    public AdditionClass(double a, double b)
    {
        d1 = a;
        d2 = b;
    }

    public void sum()
    {
        System.out.println("Sum = "+(d1+d2));
    }
}