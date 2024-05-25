package OOPS.BasicPrograms;

public class prog
{
    public static void main(String[] args)
    {
        /* If child has DC then it will automatically call Parent Class DC.
          It calls everytime when an obj is created */

        Student s = new Student(); // calls Per-DC & std-DC

        Student s1 = new Student("ABC"); //// calls Per-DC & std-DC
        System.out.println(s1.s);


        Person p= new Person("JJJ");
        System.out.println(p.a);

        Person p2 = new Person("KKK", 57);
        System.out.println(p2.a);
        System.out.println(p2.a1);

    }

}

class Person
{
    String a; int a1;
    Person()
    {
        System.out.println("Person - Default Constructor");
    }


    Person(String a)
    {
        System.out.println("Person -1 Parametrized Constructor");
        this.a=a;
    }

    Person(String a,int a1)
    {
        System.out.println("Person - 2 Parametrized Constructors");
        this.a=a;
        this.a1 = a1;
    }
}

class  Student extends Person
{
    String s;

    Student(String s)
    {
        System.out.println("Student - Parametrized Constructor");
        this.s=s;
    }

    Student()
    {
        System.out.println("Student - Default Constructor");
    }

}
