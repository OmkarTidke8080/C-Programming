// Use of nested for loop
// Write a program to display the following pattern
/*
*
* * 
* * *
* * * *
* * * * *

*/

public class Program5
{
    public static void main(String arg[])
    {
        int r = 5; // row initialization

        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
