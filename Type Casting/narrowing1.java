// write a program fro creating sub class reference which is used to refer to the super class object

public class narrowing1
{
    public static void main(String args[])
    {
        Two t; // t is a sub class method
        t = (Two)new One(); // t is referring to super class object
        t.show1(); 

    }
    
}

class One
{
    void show1()
    {
        System.out.println("Super class method");
    }
}
class Two extends One
{
    void show2()
    {
        System.out.println("Sub class method");
    }
}