// Write a program to create Sample class which contains two methods with the same namne but different signatures

class DynamicPoymorphism
{
    public static void main(String args[])
    {
        Sample s = new Sample();
        s.add(10,20 );
        s.add(100, 200, 300);

    }
}

class Sample
{
    // method to add two values
    void add(int a, int b)
    {
        System.out.println("Sum of two = "+ (a + b));
    }

    // method to add three values
    void add(int a, int b, int c)
    {
        System.out.println("Sum of three Numbers is "+ (a + b + c));
    }
}