// Writa a program to check whether th given year is leap year or not

import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.lang.model.util.ElementScanner6;

import java.io.*;

class LeapYear
{
    public static void main(String arg[]) throws IOException
    {
        // create a buffrered reader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept a year
        System.out.println("Enter Year");
        int Year = Integer.parseInt(br.readLine());

        if( (Year % 100 == 0) && (Year % 400 == 0))
        {
            System.out.println("It is  a leap year");
        }
        else if(( Year % 100 != 0) && (Year % 4 == 0))
        {
            System.out.println("It is  a leap Year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}
