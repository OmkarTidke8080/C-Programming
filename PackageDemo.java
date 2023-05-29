import Marvellous.Arithmetic;
import Marvellous.Mathematics;


public class PackageDemo 
{
    public static void main( String arg[])
    {
        Arithmetic  aobj = new Arithmetic();
        Mathematics  mobj = new Mathematics();

        float iRet = 0;

        iRet = aobj.Addition(10,11);
        System.out.println(+iRet);

        iRet = aobj.Substraction(10,11);
        System.out.println(+iRet);


        iRet = mobj.Square(10);
        System.out.println(+iRet);


        iRet = mobj.Cube(10);
        System.out.println(+iRet);



    }

    
}
