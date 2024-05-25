package OOPS.inheritance.multiple_inheritance;

public class prog
{
    public static void main(String[] args) {

        System.out.println("we cant create an object for interface"); // Engine e1 = new Engine();
        System.out.println("*********");
        //System.out.println("");

        Car c1 = new Car();
        c1.startEngine();
        c1.applyBreak();


        // Default
        c1.haltingEngineJustStart();
        c1.haltingEngineJustStop();

        Engine.M1(); // we can directly by using a class name

        c1.stopEngine();

    }
}
