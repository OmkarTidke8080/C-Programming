// write a program which shows the use of HashSet and Iterator
import java.util.*;
import java.util.HashSet;


public class Program2
{
    public static void main(String args[])
    {
        // Create a hashset to store a string
        HashSet<String> hs = new HashSet<>();

        // store some string elements
        hs.add("INDIA");
        hs.add("JAPAN");
        hs.add("CHINA");
        hs.add("AMERICA");

        System.out.println("Hash Set = "+hs);

        // add an iterator to hs
        Iterator it = hs.iterator();

        System.out.println("Elements using Iterator : ");
        while(it.hasNext())
        {
            String s = (String)it.next();
            System.out.println(s);
        }
    }
    
}
