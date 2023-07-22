// write a program to compose a full name of a person

import java.io.*;

public class fullName
{
    public static void main(String rg[]) throws IOException
    {
        // create empty string buffer object
        StringBuffer sb = new StringBuffer();

        // Accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accetp suranme
        System.out.print("Enter Surname");
        String sur = br.readLine();

        // Accept middle name
        System.out.print("Enter middle name");
        String mid = br.readLine();

        // Accept lastName
        System.out.print("Enter Lastename");
        String last = br.readLine();

        // Append sur to sb

        sb.append(sur);

        // Append last to sb
        sb.append(last);

        // Display the name till now
        System.out.println("Name "+sb);

        // Insert mid after suname in sb
        int n = sur.length();
        sb.insert(n,mid);

        // display fulll name
        System.out.println("Full Name : "+sb);


    }

}