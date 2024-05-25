package OOPS.inheritance.multiple_inheritance;

public class Car implements Brake,Engine //multiple inheritance
{
    @Override

    public void applyBreak()
    {
        System.out.println("Applying Brake");
    }

    @Override
    public void startEngine()
    {
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Stopping Engine");
    }
}
