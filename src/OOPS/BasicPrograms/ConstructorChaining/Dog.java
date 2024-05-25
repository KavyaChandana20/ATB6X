package OOPS.BasicPrograms.ConstructorChaining;

public class Dog extends Animal
{
    String breed;
    int a;
    Dog()
    {
        super();
        System.out.println("Dog DC");
    }

    Dog(String breed)
    {
        this.breed = breed;
    }

    Dog(String breed, String color)
    {
        this("QQQ"); // calling its own constructor --> dog(sting breed)
        this.color = color;
        System.out.println("PC with 2 Args.");
    }


    void display()
    {
        System.out.println("color : " + color + ", Breed: " + breed);
    }
}
