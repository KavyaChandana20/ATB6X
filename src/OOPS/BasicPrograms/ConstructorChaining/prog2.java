package OOPS.BasicPrograms.ConstructorChaining;

public class prog2
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();

        Dog d2 = new Dog("ABC");
        d2.display();


        Dog d3 = new Dog("Golden Retriever","Blue");
        d3.display();
    }
}
