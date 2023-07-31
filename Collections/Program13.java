// Write a program that shows the use of Calendar class

import java.util.*;

public class Program13
{
    public static void main(String args[]) throws Exception
    {
        // create calendar class object
        Calendar cl =  Calender.getInstance();

        // Display date separately
        System.out.println("Current date : ");
        int dd = cl.get(Calender.DATE);
        int mm = cl.get(Calender.MONTH);
        ++mm;

        int yy = cl.get(Calender.YEAR);
        System.out.println(dd+""+mm+""+yy);

        // Display time alone
        int h = cl.get(Calender.HOUR);
        int m = cl.get(Calender.MINUTE);
        int s = cl.get(Calender.SECONDS);
        System.out.println(h+" :"+m+":"+s);

        int x = cl.get(Calender.AM_PM);

        if(x==0)
        {
            System.out.println("GOOD MORNING");
        }
        else
        {
            System.out.println("GOOD EVENING");
        }

    }
    
}
