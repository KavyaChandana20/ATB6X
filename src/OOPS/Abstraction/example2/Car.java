package OOPS.Abstraction.example2;

abstract class Car extends Engine {
    @Override
    void start()
    {
        System.out.println("Starting the car");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void partGearBox() {
        System.out.println("Assemble the GEARBOX");
    }

    @Override
    void unlockCar() {

        System.out.println("Unlock the Car");

    }

    abstract void brakeMech();
}
