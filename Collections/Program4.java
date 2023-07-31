// Write a program which shows the use of Linked List class

import java.util.*;
import java.io.*;
public class Program4
{
    public static void main(String args[]) throws IOException
    {
        // create an empty linked list class to store strings
        LinkedList<String> ll = new LinkedList<>();

        // add some names to linkes list
        ll.add("INDIA");
        ll.add("AMERICA");
        ll.add("RUSSIA");
        ll.add("CHINA");
        ll.add("JAPAN");

        // display the elements of linked list
        System.out.println("List : "+ll);

        // vars
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position, choice = 0;

        while(choice <= 4)
        {
          System.out.println("\n -----------LINKED LIST -------------");
          System.out.println("1. Add element");
          System.out.println("2. Remove element");
          System.out.println("3. change an element");
          System.out.println("4. Exit");

          System.out.println("Your Choice : ");
          choice = Integer.parseInt(br.readLine());

          switch(choice)
          {
            case 1 : 
            System.out.println("Enter elements : ");
            element = br.readLine();
            System.out.println("AT WHich position : ");
            position = Integer.parseInt(br.readLine());
            ll.add(position - 1,element);
            break;

            case 2 :
            System.out.println("ENTER Position : ");
            position = Integer.parseInt(br.readLine());
            ll.remove(position -1);
            break;

            case 3 : 
            System.out.println("ENter position : ");
            position = Integer.parseInt(br.readLine());
            System.out.println("Enter the new element : ");
            element = br.readLine();
            ll.set(position -1, element);
            break;

            default : return;
          }
          System.out.println("List = ");
          Iterator it = ll.iterator();
          while(it.hasNext())
          {
            System.out.println(it.next());
          }
        }
    }
}
