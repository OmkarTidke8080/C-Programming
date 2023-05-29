import java.util.*;


public class ArrayforLoop {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements :");
        
        int iCnt = 0;
 
        //       1          2            3
        for( iCnt = 0; iCnt < iSize;  iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); //4
        }
         
        System.out.println("Elements of Array ara : ");
        for( iCnt = 0; iCnt < iSize;  iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

       
        sobj.close();




    }
    
}
