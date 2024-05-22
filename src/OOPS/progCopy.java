package OOPS;

public class progCopy
{
    public static void main(String[] args)
    {
        copyConstructor cp1 = new copyConstructor("John", 30);
        copyConstructor cp2 = new copyConstructor(cp1);
        copyConstructor cp3 = new copyConstructor(cp1);
        copyConstructor cp4 = new copyConstructor(cp1);

        System.out.println(cp1.name + " is " + cp1.age + " years old");
        System.out.println(cp2.name + " is " + cp2.age + " years old");
        System.out.println(cp3.name + " is " + cp3.age + " years old");
        System.out.println(cp4.name + " is " + cp4.age + " years old");

        /* output
        John is 30 years old
        John is 30 years old
        John is 30 years old
        John is 30 years old
         */
    }

}
