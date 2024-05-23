package OOPS.inheritance.hierachical_inheritance.example2;

public class Prog1
{
    public static void main(String[] args) {

        Car c = new Car();
        c.m1();

        Vehicle v1 = new Car(); // creating obj for child class using parent class[Vehicle]
        v1.m1();

        System.out.println("**********");
        Bike b = new Bike();
        b.m1();
    }
}
