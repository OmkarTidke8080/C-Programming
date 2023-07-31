// previous program with single catch block

import java.net.SocketTimeoutException;

public class Program4
{
    public static void main(String args[])
    {
        try
        {
            // open the files
            System.out.println("open files");
            
            // do some processing
            int n = args.length;

            int a = 45/ n;
            System.out.println(" a = "+a);
            int b[] = {10,20,30};
            b[50] = 100;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException aie)
        {
            // Display exception details
            System.out.println(aie);
        }
        finally
        {
            // close the files
            System.out.println("Close files");
        }
    }
    
}
