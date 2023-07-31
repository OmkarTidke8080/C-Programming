// write a program which shows how to handle the ArithmeticException and ArrayIndexOutOfBounsException

class Program3
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
            int b[] = {3,5,7};
            b[50] = 100;
        }
        catch(ArithmeticException ae)
        {
            // display the Exception details
            System.out.println(ae);

            // Display any message to the user
            System.out.println("Please pass data while running this program");
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            aie.printStackTrace();
            // display a message to user 
            System.out.println("Please verify that array index is within the range");
        }
        finally
        {
            // close the files
            System.out.println("Close files");
        }
    
    }
}