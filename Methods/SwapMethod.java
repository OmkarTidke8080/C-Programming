// write  a program to swap two numbers

class check
{
    void swap(int num1 , int num2)
    {
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public void swap(employee obj1, employee obj2) {
    }
}


public class SwapMethod
{
    public static void main(String args[])
    {
      int num1 = 10; int num2 = 20;

      check obj = new check();
      
      System.out.println("Values befor swap  : ");
      System.out.println( num1+"\t" + num2 );

      obj.swap(num1, num2);

      System.out.println("Values after swap");
      System.out.println(num1 + "\t" + num2);
    }
    
}
