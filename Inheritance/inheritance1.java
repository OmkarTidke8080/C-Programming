class Student
{
    // intance variables
    int id;
    String name;
    String Address;
    float Marks;

    // getter and setter methods to store and retrieve data

    void setid(int id)
    {
        this.id = id;
    }

    int getId()
    {
        return id;
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    void setAddress(String Address)
    {
        this.Address = Address;
    }

    String getAddress()
    {
        return Address;
    }

    void setMarks(int Marks)
    {
        this.Marks = Marks;
    }

    float getMarks()
    {
        return Marks;
    }
}

class inheritance1
{
    public static void main(String args[])
    {
        // create an object to student class

        Student s = new Student();

        // store data into object using setter mwthods

        s.setid(101);
        s.setName("Omkar Tidke");
        s.setAddress("MIG 12 Taokir Nagar");
        s.setMarks(550);

        // retrive data using gettr methods

        System.out.println("Id = "+s.getId());
        System.out.println("Name = "+s.getName());
        System.out.println("Address = "+s.getAddress());
        System.out.println("Marks = "+s.getMarks());

    }
}