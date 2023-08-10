// Write a program to show serialization of objects

import java.io.*;
import java.util.*;

public class Storeobj
{
    public static void main(String[] args) throws Exception
    {
        // to read data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //connect fileoutput stream to objfile
        FileOutputStream fos = new FileOutputStream("objfile");

        // connect objectOutputstream to the fileoutputstream
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // ask how may employees
        System.out.println("How Many employees : ");
        int n = Integer.parseInt(br.readLine());

        // do for n lines
        for(int i = 0; i < n ; i++)
        {
            Employee e = new Employee();

            // store data into e
            e.getData();

            // write data into obj file
            oos.writeObject(e);
        }

        oos.close();

    }
    
}
