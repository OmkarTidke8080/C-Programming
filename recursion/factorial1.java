import java.util.*;

public class factorial1
{
   public static void main(String[] args)
   {
      factorial obj = new factorial();

      for(int Counter = 0; Counter <= 10; Counter++)
      {
        System.out.printf("%d! = %d\n",Counter,obj.factorial(Counter));
      }
   }
}

class factorial
{
     // recursive definition method for factorial
     public long factorial(long number)
     {
        if(number <= 1)
        {
            return 1;  // base cases : 0! and 1!
        }
        else
        {
           // recursion step
           return number * factorial(number - 1);
        }
     }
}