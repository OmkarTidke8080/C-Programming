// write a program to call cube() method in class One

import java.util.*;

public class Relation1
{
   public static void main(String args[])
   {
     
     // create class Three's object obj3
     Three obj3 = new Three();

     // create class twos object and pass obj3
     Two obj2 = new Two(obj3);

     // create class ones object and pass obj2
     One obj1 = new One(obj2);

     // call cube method of class one
     double result1 = obj1.cube(3);

     System.out.println("Cube of three is : "+result1);

     // call Square method of class two

     double result2 = obj2.square(6);
     System.out.println("Square of six is "+result2);
   }
}

class One
{
    // obj2 is class Two's reference

    Two obj2;

    // initialise obj2 

    public One(Two obj2)
    {
        this.obj2 = obj2;
    }

    double cube(double X)
    {
        // call class Two's method using obj2
        double Result = X * obj2.square(X);

        // return reuslt to relate clas
        
        return Result;
    }
}

class Two
{
    // obj3 is class threes reference

    Three obj3;

    public Two(Three obj3)
    {
        this.obj3 = obj3;
    }

    double square(double x)
    {
        // call class three's method using obj3

        double result = x * obj3.get(x);

        // return result to class one
        return result;
    }
}

class Three
{
    double get(double x)
    {
        // just return x value to class Two
        return x;
    }
}