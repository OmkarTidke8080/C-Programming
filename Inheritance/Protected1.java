// Write a program to understand that private members are not accessible in sub class but protected members are available

import javax.annotation.processing.SupportedOptions;

public class Protected1
{
    public static void main(String args[])
    {
       sub s = new sub();
       s.get();
    }
}
class Access
{
    private int a;
    protected int b;
}

class sub extends Access
{
   public void get()
   {
    System.out.println(a);
    System.out.println(b);
   }
}