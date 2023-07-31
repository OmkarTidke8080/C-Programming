// Write  a program to create an array list with string and perform various operarions on it

import java.util.ArrayList;
import java.util.Iterator;

public class Program5
{
    public static void main(String args[]) 
    {
        ArrayList<Integer> Arr = new ArrayList<>();

        // add elements
        Arr.add(10);
        Arr.add(11);
        Arr.add(12);
        Arr.add(13);
        Arr.add(14);

        // Display contents 
        System.out.println("Contents : "+Arr);
        
        // remove two objects
        Arr.remove(3);
        Arr.remove(2);

        // Display the Contents after removing the elements
        System.out.println("Contents : "+Arr);

        // Display its size 
        System.out.println("Arrat list Size : "+Arr.size());

        // extract elements using iterator
        System.out.println("Exctracting elements using iterator ");

        Iterator It = (Iterator) Arr.iterator();
        
        while(It.hasNext())
        {
            System.out.println(It.next());
        }

    }
    
}
