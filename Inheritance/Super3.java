// write a program which prove that default constructor of super class is availabe to the sub class

class Super3
{
    public static void main(String args[])
    {
      Two t = new Two();
      
    }
}
class One
{
  // super class default constructor
  One()
  {
    System.out.println("Inside default constructor of one");
  }

}

class Two extends One
{
    // class Two's default constructor
    Two()
    {
        System.out.println("Inside default constructor of two");
    }
}