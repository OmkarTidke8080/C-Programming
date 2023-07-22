// write a program to make cloning Employee class object by writing our own myvlone() method


public class cloneDemo
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
       // create employee class object using new operator
       Employee e1 = new Employee(10, "Omkar");
       System.out.println("Original Data  : ");
       e1.getData();

       // create another object by cloning e1. As myClone() method returns the Object of Object Class type, it should be converted to Employee type
       Employee e2 = (Employee)e1.myClone();
       
       System.out.println("Cloned object");
       e2.getData();
    }
}
class Employee implements Cloneable
{
    // instance variable
    int id;
    String name;

    // constructors to initialize the variables

    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // method to display the details
    void getData()
    {
        System.out.println(" id = "+ id);
        System.out.println("Name = "+name);
    }

    // clone the present class object
    public Object myClone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}