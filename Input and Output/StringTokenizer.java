// Accept name , age and salary on one line using string tokenizer

import java.io.*;

public class StringTokenizer
{
    public StringTokenizer(String str, String string) {
    }

    public static void main(String arg[]) throws IOException
    {
        // create a buffered reader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for input separated by commas
        System.out.println("Enter Name , age , salary : ");

        // Accept input to a string
        String str = br.readLine();

        // using string tokenizer to split input a commas
        StringTokenizer st = new StringTokenizer(str,",");

        // 3 tokens as string

        // 1st name
        String s1 = st.nextToken();

        // 2nd age
        String s2 = st.nextToken();

        // 3rd Salary
        String s3 = st.nextToken();

   
        /* 
        // Trim any spaces befor and after the tokens
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim(); 
        */
        
        // converting s1 into string
        String name = s1;

        // converting s2 into integer
        int age = Integer.parseInt(s2);

        // converting s3 into flaot
        float salary = Float.parseFloat(s3);

        // Display the entered data
        
    
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Salary = "+salary);
    }

    private String nextToken() {
        return toString();
    }

   

   

  

    
    }

