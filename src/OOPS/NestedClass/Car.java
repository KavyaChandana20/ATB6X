package OOPS.NestedClass;

public class Car
{
    String make;

    public Car(String make)
    {
        this.make = make;
    }

    // Method
    void drive()
    {
        System.out.println("You can driver Car");
    }

    class Engine //outer class
    {
        String horsePower; // Instance Variables

        public Engine(String horsePower)
        {
            this.horsePower = horsePower;
        }


        void start()  // Method
        {
            System.out.println("Enginer is started!! -> " + make);
        }

    }
}
