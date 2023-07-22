// Write a program to take class One and class Two and create the reference of class Two in class One. using this reference refer to the instance variables and methods of class Two

// relating class two with clss One

public class Relate
{
    public static void main(String args[])
    {
      // create class twos object and storee 22 value
      Two obj2 = new Two(22);

      // create class one object and pass class Two's object to it
      One obj1 = new One(obj2);

      // call class Ones method
      obj1.Display();

    }
}

class One
{
    // instance variables
    int x;
    Two t;  // class Two's reference
     
    // constructor that receieves class Twos reference
    One(Two t)
    {
        // copy twos referenece into t
        this.t = t;
        x = 10;

    }
    // methods to display class One and class Twos varibales
    void Display()
    {
        System.out.println("One's x "+x);

        // call class Two's method
        t.Display();

        // Access class Two's var
        System.out.println("Two's var "+t.y);

    }
}
class Two
{
    // instance variables
    int y;

    // initialise y
    Two(int y)
    {
      this.y = y;
    }
    
    // method to display y
    void Display()
    {
        System.out.println("Two's y" +y);
    }

}
