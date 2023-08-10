// write a program to create a text file using FileWriter

import java.io.*;

public class Program5
{
    public static void main(String[] args) throws IOException
    {
        String str = "This is Java Tutorial.."+"I am Learner of Java.";

        // attahc file to filewriter
        FileWriter fw = new FileWriter("text");

        // read character wise from string and write into filewriter

        for(int i = 0; i < str.length(); i++)
        {
            fw.write(str.charAt(i));
        }

        fw.close();
    }
    
}
