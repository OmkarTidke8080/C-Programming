// Write a program to perform different operations on a stack through a menu driven approach

import java.util.*;
import java.io.*;

public class Program3
{
  public static void main(String args[]) throws Exception
  {
    // create an empty stack to contain integer objects
    Stack<Integer> st = new Stack<>();

    // take variables
    int choice = 0;
    int position, element;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // display the menu as long as user choice < 4

    while(choice < 4)
    {
        System.out.println("--------STACK OPERATIONS--------");
        System.out.println(" 1 : Push an element");
        System.out.println(" 2 : Pop an element");
        System.out.println(" 3 : Search an element");
        System.out.println(" 4 : Exit");
        System.out.println("Enter Your choice");

        choice = Integer.parseInt(br.readLine());

        switch(choice)
        {
            case 1 : System.out.println("Enter element : ");
            element = Integer.parseInt(br.readLine());
            st.push(element);
            break;

            case 2 :
            Integer obj = st.pop();
            System.out.println("Popped = "+obj);
            break;

            case 3 :
            System.out.println("Which element ");
            element = Integer.parseInt(br.readLine());
            position = st.search(element);
            if(position == -1)
            {
             System.out.println("Element not found");
            }
            else
            {
                System.out.println("Position : "+position);
            }
            break;

            default : 
            return;
        }
    }
  }   
}
