// Write a program to split a string


public class StringSplit
{
    public static void main(String args[])
    {
        String str = "HEllo this is a book on java";
        
        // declare a string type array to store the broken pieces

        String S[];

        // split h string where space is found
        S = str.split(" ");

        // Display the pieces from String S
        for(int i = 0; i < S.length; i++)
        {
            System.out.println(S[i]);
        }


    }
    
}
