// write a program to create Person class object and use accessor and mutator methods

class Person
{
    // instance variables
    String Name ;
    int Age;

    // mutator methods
    public void setName(String string)
    {
        this.Name = Name;
    }
    public void setAge(int i)
    {
        this.Age = Age;
    }

    // Accessor methods

    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
}

public class Instance
{
    public static void main(String args[], int i, String string)
    {
       Person p1 = new Person();
       
       // store some data in the object
       p1.setName("Omkar");
       p1.setAge(21);
    
       // read the data from object
       System.out.println("Name = "+p1.getName());
       System.out.println("Age : "+p1.getAge());

    }
}
