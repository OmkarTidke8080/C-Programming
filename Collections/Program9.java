// write a program that shows the use of HashTable class

import java.util.*;
import java.io.*;

public class Program9
{
  public static void main(String args[]) throws IOException
  {
     // create hashtable with names and scores

     Hashtable<String,Integer> ht = new Hashtable<>();

     ht.put("Ajay",50);
     ht.put("Sachin",77);
     ht.put("Gavaskar",80);
     ht.put("Kapil",60);
     ht.put("Dhoni",85);

     // display all the player names using enumerator
     System.out.println("The player names : ");
     Enumeration e = ht.keys();
     while(e.hasMoreElements())
     {
        System.out.println(e.nextElement());
     }

     // Accept player name from keyboard
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter player name : ");
     String name = br.readLine();
     name = name.trim();

     // get Score of the player
     Integer score = ht.get(name);
     if(score != null)
     {
        int sc = score.intValue();
        System.out.println(name +"Scored :"+sc);
     }
     else
     {
        System.out.println("Player not found");
     }


  }
    
}
