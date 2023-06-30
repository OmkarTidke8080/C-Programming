// write a program to display an array as a matrix

public class matrix
{
    public static void main(String arg[])
    {
        float frr[][] = {{1.1f, 1.2f, 1.3f,1.4f},
                         {2.1f, 2.2f, 2.3f,2.4f},
                         {3.1f, 3.2f, 3.3f,3.4f}};

        // Display the array in a matrix form
        System.out.println("In a matrix form");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(frr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
