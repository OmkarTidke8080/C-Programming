public class hanoi_Tower {
    public static void main(String[] args)
    {
        int n = 4;

        Tower obj = new Tower();

         obj.TowersOfHanoi(n,'A','B','C');
    }

    
}

class Tower
{
    public void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg)
    {
        // if only 1 disk then move and return
        if(n == 1)
        {
            System.out.println("Move disk 1 from peg " +frompeg+ "to peg" +topeg);
            return;
        }
        
        
            // move n - 1 disks from A to B, using C as auxillary
            TowersOfHanoi(n - 1, frompeg, auxpeg, topeg);
         
            // move remaining disks from A to C
            System.out.println("Move disk from peg" +frompeg+ "to peg" +topeg);

            // move n - 1 disk from B to C using A as auxillary
            TowersOfHanoi( n - 1, auxpeg, topeg, frompeg);
    }
}
