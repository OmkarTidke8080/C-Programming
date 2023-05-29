import java.util.Scanner;

 class ExceptionDemo 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int  No1 = 0 , No2 = 0 ;
        float Ans = 0.0f;
        System.out.println("Enter First Number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        No2 = sobj.nextInt();

        try
        {
           Ans = No1 / No2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception ocuered & code is inside catch block :"+obj);
        }
        finally{
            System.out.println("Code is inside finally block..");
            System.out.println("Division is : "+Ans);
        }           
        //System.out.println("Division is : "+Ans);
    }
}
