package OOPS.staticKeyword;

public class ProgPerson
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Kavya");
        Person p2 = new Person("Chandana");

        System.out.println("p1 name  : "+p1.name);
        System.out.println("p2 name  : "+p2.name);

        System.out.println(Person.footBallClub);

        Person.m1(); // Static method/variable can be called by --> ClassName.func(); & ref.func()

        // Non Static method/variable can be called only by --> Ref.func();
        p1.m1();
        p2.m1();

        Person.footBallClub = "AAA";
        System.out.println(p1.footBallClub);
        System.out.println(p2.footBallClub);

        p1.name = "abc";
        System.out.println("p1 name  : "+p1.name);
        System.out.println("p2 name  : "+p2.name);

        // Non Static - Ref
        p1.m2();
        p2.m2();

    }





}
