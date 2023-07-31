// write a program to throw a user defines exception

public class Program8
{
    public static void main(String args[])
    {
       try
       {
        // display heading fot the table
        System.out.println("ACCNO "+"\t"+"CUSTOMER"+"\t"+"Balance");

        // Display actual account info
        for(int i = 0; i < 5; i++)
        {
            System.out.println(accno[i]+"\t"+name[i]+"\t"+"bal[i]");
            
            // display my own exception if balance < 10000
            if(bal[i] < 10000)
            {
                MyException me = new MyException("Balance amount is less");
                throw me;
            }
        }
       }
       catch(MyException me)
       {
        me.printStackTrace();
       }
    }
}
class MyException extends Exception
{
    // store account information
    private static int accno[] = {1001,1002,1003,1004,1005};

    private static String name[] = {"Raja Rao","Omkar Tidke","Rama Rao","Subha Rao","Lakshmi Devi"};

    private static double  bal[] = {10000.00,12000.00,15000.00,45000.00,8000.00};

    // default constructor
    MyException()
    {

    }

    // parameterised constructor

    MyException(String str)
    {
       super(str);
    }

}
