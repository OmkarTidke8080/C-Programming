// Write a program that shows the compile time error for IOException

// not handling the exception

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program5
{
    public static void main(String args[])
    {
       Sample s = new Sample();
       s.accept();
       s.Display();
    }
    
}
class Sample
{
    private String name;

    // method to accept name
    void accept()
    {
        // to accept data afrom keyboard
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name : ");
        name = Br.readLine();
    }
    void Display()
    {
        System.out.println("Name = "+name);
    }
}