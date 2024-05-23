package OOPS.BasicPrograms;

public class copyConstructor
{
    String name;
    int age;

    // Parameterized constructor
    copyConstructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    copyConstructor(copyConstructor cp)
    {
        this.name = cp.name;
        this.age = cp.age;
    }

}
