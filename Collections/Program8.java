// write  a java program that shows the use of hashMap class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.sound.midi.Soundbank;

public class Program8
{
    public static void main(String args[]) throws IOException
    {
      // create hashmap
      HashMap<String,Long> hm = new HashMap<>();
      
      //vars
      String name, str;
      Long pno;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      while(true)
      {
        System.out.println("1. Enter Phone number entries");
        System.out.println("2. LookUp in the book");
        System.out.println("3.Display Names in Book");
        System.out.println("4. Exit");

        System.out.println("Your choice : ");
        int n = Integer.parseInt(br.readLine());

        switch(n)
        {
            case 1 :
            System.out.println("Enter name : ");
            name = br.readLine();
            System.out.println("Enter PNO");
            str = br.readLine();
            pno = Long.parseLong(str);

            hm.put(name,pno);
            break;

            case 2 :
            System.out.println("Enter name : ");
            name = br.readLine();
            name = name.trim();
            pno = hm.get(name);
            System.out.println("pno : "+pno);
            break;

            case 3 : 
            Set<String> set = new HashSet<String>();
            set = hm.keySet();
            System.out.println(set);
            break;

            case 4 : return;


        }
      }


    }
    
}
