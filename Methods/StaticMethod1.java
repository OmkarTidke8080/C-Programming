// write a program to test whether a static method can access the instance variables or not

class Test
{
    // Instance variables :
    int x;

    Test(int x)
    {
        this.x = x;
    }

    // static methods accessing x value
    static void access()
    {
        System.out.println(" x = "+x);
    }
}




public class StaticMethod1
{
    public static void main(String[] Args)
    {
       Test obj = new Test(55);
       Test.access();
    }
    
}
