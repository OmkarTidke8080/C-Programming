//write a program to show use of date class

import java.util.*;
import java.text.*;

public class Program14
{
    public static void main(String args[])
    {
      Date d = new Date();

      DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT , Locale.UK);

      // apply above format to the date object
      String str = fmt.format(d);

      System.out.println(str);
    }
    
}
