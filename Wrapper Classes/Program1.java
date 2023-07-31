// write a program which accepts a character from keyboard and disply its type

import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Program1
{
    public static void main(String args[]) throws Exception
    {
      // to accept a char from keyboard
      char ch;

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      while(true)
      {
        System.out.println("Enter a character : ");
        ch = (char)br.read();

        // test an display the type f character
        System.out.println("You entered :");
        if(Character.isDigit(ch));
        {
        System.out.println("a digit");
        }
         if(Character.isUpperCase(ch))
        {
        System.out.println("is Upper case letter");
        return ;
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println("is Lower case letter");
            return ;
        }
        else if(Character.isSpaceChar(ch))
        {
            System.out.println(" is a  space bar");
            return ;
        }
        else if(Character.isWhitespace(ch))
        {
            System.out.println("is White space character");
            
        }
        else
        {
            System.out.println("Sorry I don't know");
        }
        br.skip(2); // to skip \n code from br
      }
    } 
}