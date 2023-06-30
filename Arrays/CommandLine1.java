// Accept two numbers as command line arguments and perform addition of those numbers

public class CommandLine1
{
    public static void main(String args[])
    {
        // check if 2 arguments are not entered 
        if(args.length != 2)
        {
            System.out.println("Please Enter values");
            return;
        }

        // take numbers from args

        String s1 = args[0];
        String s2 = args[1];

        // convert them into numerics
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);

        // add them and display

        double d3 = d1 + d2;

        System.out.println("The Additon is : "+d3);
    }
}
