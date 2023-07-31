// Write a program that opens the diles in the beginning. then the number of command line arguments is accepted in n. then n divides a number 45 and the result is stored in a. finally the files are closed

public class Program1
{
    public static void main(String args[])
    {
        // open the files
         System.out.println("Open  files");

         // do some processing
         int n = args.length;
         System.out.println("n = "+n);

         int a = 45/n;
         System.out.println("a = "+a);

         // close the files
         System.out.println("Close files");

    }
}