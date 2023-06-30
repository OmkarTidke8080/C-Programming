// Write a program to accept command line from user 

public class CommandLine
{
    public static void main(String args[])
    {
        // find number of arguments
        int n = args.length;
        System.out.println("No of args = "+n);

        // Display all the arguments
        System.out.println("The arguments are : ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(args[i]);
        }
    }
}
