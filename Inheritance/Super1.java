// write a program where names of instance variables and methods in super and sub classes are same. 

class One
{
    //super class variable
    int i = 10;

    // super clas method
    void show()
    {
        System.out.println("Super class method is : "+i);
    }

    class Two extends One
    {
        // sub class var
        int i = 20;

        // sub class method
        void show()
        {
            System.out.println("sub class method is " +i);
        }
    }
}
class Super1
{
    public static void main(String arg[])
    {
        // create subclass  objects
        Two t = new Two();

        t.show();
    }
}