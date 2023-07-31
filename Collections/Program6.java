// Write a program that shows the use of vector class

import java.util.ListIterator;
import java.util.Vector;

public class Program6
{
    public static void main(String args[])
    {
        Vector<Integer> v = new Vector<>();

        // take an int type array
        int x[] = {10,20,30,40,50,60};
        
        // when x[i] is stored in vector v. the x[i] values are converted into integer objects and stored into v. this is autobaoxing

        for(int i = 0; i < x.length; i++)
        {
            v.add(x[i]);
        }

        System.out.println("Vector elements are : ");
        for(int j = 0; j <v.size(); j++)
        {
            System.out.println(v.get(j));
        }

        // retrive elements using ListIterator
        ListIterator lit = v.listIterator();

        System.out.println("Elements in forward direction : ");
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }

        System.out.println("Elements in backward direction : ");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
    }
}
