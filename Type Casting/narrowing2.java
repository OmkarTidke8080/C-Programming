// write a program for creating super class reference to refer to sub class object

public class narrowing2
{
     public static void main(String args[])
     {
       One o;  
       o = new Two();        // super class reference to refer to the sub class object
       Two t = (Two)o;   // this is narrowing - convert class Ones reference 
       t.show1();
       t.show2();
     } 
}
class One
{
    void show1()
    {
        System.out.println("Super class method");
    }
}
class Two extends One
{
    void show2()
    {
        System.out.println("Sub class method");
    }
}
