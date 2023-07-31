// Write a program that shows the use of StringTokenizer object

import java.util.StringTokenizer;

public class Program12
{
    public static void main(String args[])
    {
        String str = "He is gentle man";

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println("The Tokens are : ");
        while(st.hasMoreTokens())
        {
            String one = st.nextToken();
            System.out.println(one);
        }
    }
    
}
