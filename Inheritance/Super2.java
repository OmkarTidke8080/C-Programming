// write a java program to access the super class method and instance variable by using super keyword from sub class

class Super2
{
  public static void main(String args[])
  {
    Two t = new Two();

    t.show();
  }
}

class One
{
    // super class var
    int i = 10;

    // super class method
    void show()
    {
        System.out.println("Suoer class method is :  i "+i);
    }
}

class Two extends One
{
    // sub class variable
    int i = 20;

    // sub class method
    void show()
    {
        System.out.println("Sub class method : i =  "+i);
        super.show();

        // using super to access super class variable
        System.out.println("Super i = "+super.i);
    }
}
