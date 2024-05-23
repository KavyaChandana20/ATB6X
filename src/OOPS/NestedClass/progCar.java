package OOPS.NestedClass;

public class progCar
{
    public static void main(String[] args) {
        Car c = new Car("Benz");
        Car.Engine engine = c.new Engine("400CC");

        engine.start();
        c.drive();

        // Nested Class - is used To shield the Inner Class.


    }
}
