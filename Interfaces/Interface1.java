// Write a program to create an interface My Inter that connects to a database and retrievs the data from the data base

import java.util.*;

public class Interface1
{
    public static void main(String args[]) throws Exception
    {
       // accept the implementation class name from Command line arguments
       Class c = Class.forName(args[0]);
       
       // create an object of class whose name is in c

       MyInter mi = (MyInter)c.newInstance();
       mi.connect();
       mi.disconnect();
    }
}

interface MyInter
{
    void connect();
    void disconnect();
}

class OracleDB implements MyInter
{
    public void connect()
    {
        System.out.println("Connecting to oracle DB");
    }
    public void disconnect()
    {
        System.out.println("Disconnecting from ORcale DB");
    }
}

class SybaseDB implements MyInter
{
    public void connect()
    {
        System.out.println("Connecting to Sybase DB");
    }
    public void disconnect()
    {
        System.out.println("Disconnecting from Sybase DB");
    }
}