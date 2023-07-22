// Write a program to test whether a static method can access a static varible or not

class Test
{
    // static var
    static int x = 55;

    static void access()
    {
        System.out.println(" x = "+ x);
    }
}


public class StaticMethod2
{
    public static void main(String Args[])
    {
        Test.access();
    }
    
}
