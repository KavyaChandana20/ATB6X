package OOPS;

public class ATBperson
{
    // Instance Variables
    String name;
    long phone;

    public ATBperson(String name, long phone, String email, boolean isMarried, String courseName)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }

    public ATBperson(String name)
    {
        this.name = name;
    }

    public ATBperson(String name, long phone)
    {
        this.name = name;
        this.phone = phone;
    }

    String email;
    boolean isMarried;
    String courseName;

    // Constructor
    // default - Constructor

    ATBperson()
    {
        System.out.println("default - Constructor");
        courseName = "ATB";
    }


    void printDetails()
    {
        //int age = 10;
        //System.out.println(age);
        System.out.println("Printing details of the student");
    }
}
