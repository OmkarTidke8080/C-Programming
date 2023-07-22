// write a program where abstract class my class has one abstract method which has got various implementations in sub class

import javax.swing.plaf.multi.MultiButtonUI;

public class Abstract2
{
    public static void main(String args[])
    {
         Sub1  sobj1 = new Sub1();
         Sub2  sobj2 = new Sub2();
         Sub3  sobj3 = new Sub3();

         sobj1.calculate(20);
         sobj2.calculate(15);
         sobj3.calculate(75);
    }
}
abstract class Myclass
{
   abstract void calculate(double x);
}

class Sub1 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("Square is : "+(x * x));
    }
}

class Sub2 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("Square root is : "+Math.sqrt(x));
    }
}

class Sub3 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("Cube is : "+ (x * x *x));
    }
}