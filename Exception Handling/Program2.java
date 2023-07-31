// Write a program to see the use of try, catch, finally blocks

public class Program2
{
    public static void main(String args[])
    {
        try
        {
            // open the files
            System.out.println("Open Files");

            // do some processing
            int n = args.length;

            System.out.println(" n = "+n);
            int a = 45/ n;
            System.out.println("a = "+a);
        }
        catch(ArithmeticException ae)
        {
            // display the Exception details
            System.out.println(ae);

            // Display any message to the user
            System.out.println("Please pass data while running this program");
        }
        finally
        {
            // close the files
            System.out.println("Close files");
        }
    }
    
}
