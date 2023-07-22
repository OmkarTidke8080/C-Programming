// write a program for static method to accept data and returns the result

class Sample
{
    // declring static method
    static double Sum(double num1 , double num2)
    {
        double Sum = num1 + num2;
        return Sum;
    }
}

public class StaticMethod
{
    public static void main(String arg[])
    {
     
      double x =  Sample.Sum(10,15);
      System.out.println("The sum is : "+x);

    }
    
}
