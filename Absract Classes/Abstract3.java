// Write a program tp write abstract class with an instance variable : rate, a concrete method : getrate() and abstract method calculateBill()

public class Abstract3
{
    public static void main(String args[])
    {
       // reference p  to abstract class Plan
       Plan p;

       System.out.println("Commercial connection : ");
       p = new CommercialPlan();

       // commercial bill for 500 units
       p.getRate();
       p.calculateBill(500);


       // calculate domestic bill for 250 units
       System.out.println("Domestic connection : ");
       p = new DomesticPlan();

       p.getRate();
       p.calculateBill(250);
    }
}
abstract class Plan
{
    // taking rate as protected so that its sub classes can use it
    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units)
    {
        System.out.println("Bill Amount for " + units);
        System.out.println(rate*units);
    }
}
class CommercialPlan extends  Plan
{
    public void getRate()
    {
        rate = 5.00;
    }
}

class DomesticPlan extends Plan
{
    public void getRate()
    {
        rate = 2.60;
    }
}