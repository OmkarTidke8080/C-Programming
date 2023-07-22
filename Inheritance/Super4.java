// Write a java program to understand that parmeterised constroctor of super class can e called from sub class

public class Super4
{
    public static void main(String args[])
    {
      Two t = new Two(11, 22);
      t.show();
    }
}
class One
{
    // super class variables
    int i;

    // parameterised constructor
    One(int i)
    {
        this.i = i;
    }
}
class Two extends One
{
    int i;

    Two(int a, int b) 
    {
        super(a); // call super class construtor and pass a
        i = b;    // initialise sub class variable
    }

    // sub class method

    void show()
    {
       System.out.println("Sub class is : "+i);
       System.out.println("Super class i = "+super.i);
    }  
}