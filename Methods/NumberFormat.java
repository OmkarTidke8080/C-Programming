// write a program to calculate area of circle using factory method number format

import java.text.*;
public class NumberFormat
{
    public static void main(String args[])
    {
        final double PI = 22/7;
        double r = 20.0;
        double area = PI * r * r;

        System.out.println("Area :  "+area);

        // create number format class object : 

        NumberFormat obj = new NumberFormat();

        // store the format information into obj

        obj.setMaximumFractionDigits(2);
        obj.setMaximumIntegerDigits(4);

        // apply the format to area value

        String str = obj.format(area);

        // display formatted area
        System.out.println(area);
      

      
    }

    private void setMaximumFractionDigits(int i) {
    }

    private void setMaximumIntegerDigits(int i) {
    }

    private String format(double area) {
        return null;
    }

    
    
}
