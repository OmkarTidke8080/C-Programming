// Write a program by taking instance variable in th test class

class Test
{
    // instance var
    int x = 10;

    // display the variable

    void display()
    {
        System.out.println(x);
    }
}
public class InstanceDemo
{
    public static void main(String args[])
    {
       // creating two references

       Test obj1, obj2;

       obj1 = new Test();
       obj2 = new Test();

       // decrement x in obj1
       --obj1.x;

       obj1.display();
       obj2.display();
    }
    
}
