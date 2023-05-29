interface Circle
{
    public final float PI = 3.14;

    public final CalculateArea();
    public float CalculateCircumference(float Radius);

}
class Demo implements Circle
{
    public float CalculateArea(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float CalculateCircumference(float Radius)
    {
        return 2 * PI * Radius;
    }
}
public class Interface 
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        float fRet = 0.0f;

        fRet = obj.CalculateArea(10.5f);
        System.out.println("Area is  : "+fRet);

        fRet = obj.CalculateCircumference(15.2f);
        System.out.println("Circumference is : "+fRet);



    }
    
}
