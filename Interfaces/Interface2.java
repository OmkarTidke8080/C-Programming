// Write a program which contains a printer interface and its implementation classes to send text to any printer

import java.io.*;

public class Interface2
{
    public static void main(String args[]) throws Exception
    { 
       // attach file reader to config.txt to read data from file
       FileReader fr = new FileReader("config.txt");
       
       // connect LineNumber to file Reader to read one line at a time
       LineNumberReader lnr = new LineNumberReader(fr);

       // read the first line from config.txt
       String printername = lnr.readLine();

       // the read line represents the printer name
       System.out.println("loading the driver fro : "+printername);

       // store the printer name in an object c

       Class c = Class.forName(printername);

       // create an object to that class represented by printer name in c

       printer ref = (printer)c.newInstance();

       ref.printit("Hello, this is printed on the printer");
       
       // disconnect after printing
       ref.disconnect();
    } 
}
interface printer
{
    // to print the text sent to printer
    void printit(String text);

    // to disconnect from printer
    void disconnect();
}

class IBMPrinter implements printer
{
    public void printit(String text)
    {
       System.out.println(text);
    }
    public void disconnect()
    {
        System.out.println("Printing completed");
        System.out.println("Disconnect from IBM printer");
    }
}
class EpsonPrinter implements printer
{
    public void printit(String text)
    {
        System.out.println(text);
    }
    public void disconnect()
    {
        System.out.println("Printing completed");
        System.out.println("Disconnecting from EPson printer");
    }
}