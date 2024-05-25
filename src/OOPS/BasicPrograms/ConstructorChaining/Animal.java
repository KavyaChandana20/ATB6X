package OOPS.BasicPrograms.ConstructorChaining;

public class Animal
{
    String color;
    Animal() {
        System.out.println("Animal DC");
    }

    Animal(String color){
        this.color = color;
        System.out.println("Animal PC");
    }
}
