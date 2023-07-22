// Accept a number from user and Display prime numbers from 0 to that number and also return the count

import java.util.*;






public class Prime
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        number nobj = new number();

         nobj.Primenumber(iNo);

    }
}
class number
{
   int iCount = 0;
   int i = 0;
   int j = 0;

   
   void Primenumber(int iNo)
   {
      for(j = 2; j <= iNo; j++)
      {
        iCount = 0;
        for(i = 1; i <=j; i++)
        {
            if(j % i == 0)
            {
                iCount++;
            }
        }
        if(iCount == 2)
        {
            System.out.println(j+" ");
        }
      }
    }
}