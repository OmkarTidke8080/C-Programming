// Write a program where Myclass' s calculate method is available to all the objects and hence every object cam calculate the square value

public class Abstract1
{
    public static void main(String args[])
    {
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();
        Myclass obj3 = new Myclass();

        obj1.caluculate(10);
        obj1.caluculate(15);
        obj1.caluculate(18);
    }
}

class Myclass
{
    void caluculate(double x)
    {
      System.out.println("Square is "+ (x * x));
    }

}