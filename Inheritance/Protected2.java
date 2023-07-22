// write a program to find area of square and rectangle by deriving them from shape

public class Protected2
{
    public static void main(String args[])
    {
         square s = new square(5);
          s.area();

          rectangle r = new rectangle(10, 50);
          r.area();
    }
}

class shape
{
    // take protected type var
    protected double i;

    //parameterised constructor

    shape(double i)
    {
        this.i = i;
    }
}

class square extends shape
{
    square(double i)
    {
        super(i);
    }

    // calculate area of square
    void area()
    {
        System.out.println("Area of square is "+ i * i);
    }
}

class rectangle extends square
{
    private double b;

    rectangle(double x, double y)
    {
        super(x);
        b = y;
    }

    void area()
    {
        System.out.println(" Area of rectangle is : "+ i * b);
    }
}