import java.io.*;

class InputDemo 
{
   public static void main(String arg[]) throws IOException     
   {
    BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter first Number");
    int No1 = Integer.parseInt(bobj.readLine());

    System.out.println("Enter second Number");
    int No2 = Integer.parseInt(bobj.readLine());

    int Ans = No1 + No2;


    System.out.println("Addition is : "+Ans);

   }  
}
