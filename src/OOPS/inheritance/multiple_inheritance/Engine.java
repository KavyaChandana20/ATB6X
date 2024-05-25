package OOPS.inheritance.multiple_inheritance;

public interface Engine
{
    void startEngine();
    void stopEngine();

    //    void M1() // A complete[ coding can be done inside {} ] method/func is not allowed in interface.
    //    {
    //        System.out.println("M1");
    //    }

    default void haltingEngineJustStart()
    //default is a method/func in interface. It is a complete method--> coding can be done inside {}.
    {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop()
    {
        System.out.println("Halt the Engine");
    }

    static void M1()
    {
        System.out.println("M1");
    }


}
