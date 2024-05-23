package OOPS.inheritance.hierachical_inheritance.example2;

public class Vehicle
{
    Vehicle()
    {
        System.out.println("Default Constructor Vehicle");
    }

    void m1()
    {
        System.out.println("called by class: "+getClass().getSimpleName());
    }
}
