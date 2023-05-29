abstract class RBI
{
     public abstract float CalculateROI();
  // virtual float calculateROI() = 0;
     public void DisplayRules()
     {
        System.out.println("You have to submit id proofs");
        System.out.println("Minimum balnce is 5000");
     }
}
class SBI extends RBI
{
    public float CalculateROI()
    {
        return 5.7f;
    }
}
class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }
}
public class AbstractDemo 
{
    public static void main(String args[])
    {
        //  RBI robj = new RBI();

        RBI robj1 = new SBI();

        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("ROI of Sbi is : "+fRet);

        fRet = bobj.CalculateROI();
        System.out.println("ROI of BOM is : "+fRet);
    }   
}
