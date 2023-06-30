// Write a program which accepts marks of students into 1D array an dfind the total and percentage of marks

import java.io.*;

public class Array1
{
    private static final String Total = null;

    public static void main(String arg[]) throws IOException
    {
        // create buffered reader object
        BufferedReader br = new BufferedReader(InputStreamReader(System.in));
 
        float percentage;
        float Total = 0;
        // Ask how many subject
        System.out.println("How many subject : ");
        int n = Integer.parseInt(br.readLine());

        int marks[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Marks ");
            marks[i] = Integer.parseInt(br.readLine());
        }

        // find total marks
        for(int i = 0; i < n ; i++)
        {
            Total = Total + i;
        }

        // Display total marks
        System.out.println("Total marks = "+Total);

        // Find Percentage
         percentage =  (float) (Total /  n);
        System.out.println("Total Percentage : " + percentage + "%");

    }


    private static Reader InputStreamReader(Object in0) {
        return null;
    }
}

