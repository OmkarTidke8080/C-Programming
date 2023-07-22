// write a program where equals method comoare My class objects reference 


public class Compare
{ 
    public static void main(String args)
    {
        // create two my class objects with same contents
        // here reference ofobject will be different

        MyClass obj1 = new MyClass(15);
        MyClass obj2 = new MyClass(15);

        // create two wrapper classe objects and store same content
        Integer obj3 = new Integer(15);
        Integer obj4 = new Integer(15);

        if(obj1.equals(obj2))
        {
            System.out.println("obj1 and obj2 are same");
        }
        else
        {
            System.out.println("obj1 and obj2 are not same");
        }

        if(obj3.equals(obj4))
        {
            System.out.println(" obj5 and obj4 are same");
        }
        else
        {
            System.out.println("obj5 and obj4 are same");
        }

    }
    
}

class MyClass
{
    int x;

    MyClass(int x)
    {
       this.x = x;
    }
}

