// Teacher class
class Teacher
{
    // instance variables
    int id;
    String name;
    String address;
    float Salary;

    // setter method
    void setId(int id)
    {
        this.id = id;
    }

    // getter method to retrieve id
    int getId()
    {
        return id;
    }

    // to store name
    void setName(String name)
    {
        this.name = name;
    }

    String name()
    {
        return name;
    }

    void setAddress(String address)
    {
        this.address = address;
    }

    String getAddress()
    {
        return address;
    }

    void setSal(float salary)
    {
        this.Salary = Salary;
    }

    float getSal()
    {
        return Salary;
    }
}
class Student extends Teacher
{
    int Marks;
    
    void setMarks(int Marks)
    {
        this.Marks = Marks;
    }

    int getMarks()
    {
        return Marks;
    }
}


public class Inheritance2
{
    public static void main(String args[])
    {
        // create an object to student class

        Student s = new Student();

        // store data into object using setter mwthods

        s.setId(101);
        s.setName("Omkar Tidke");
        s.setAddress("MIG 12 Tapkir Nagar");
        s.setMarks(550);

        // retrive data using gettr methods

        System.out.println("Id = "+s.getId());
        System.out.println("Name = "+s.name());
        System.out.println("Address = "+s.getAddress());
        System.out.println("Marks = "+s.getMarks());

    }
    
}
