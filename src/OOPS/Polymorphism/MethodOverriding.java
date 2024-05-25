package OOPS.Polymorphism;

public class MethodOverriding
{
    public static void main(String[] args)
    {
        System.out.println("If subclass (child class) has the same method as declared in the parent class, " +
                "it is known as method overriding in Java.");

        System.out.println("****************");
        System.out.println("");

        System.out.println("Rule:");
        System.out.println("The method must have the same NAME as in the parent class");
        System.out.println("The method must have the same PARAMETER as in the parent class.");

        System.out.println("****************");
        System.out.println("");

        Child c =new Child();
        c.display();

    }

}

class Parent
{
    void display()
    {
        System.out.println("Im a display method from parent class");
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("Im a display method from child class");
    }
}
