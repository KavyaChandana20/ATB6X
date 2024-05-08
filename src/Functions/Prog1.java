package Functions;

public class Prog1 {
    public static void main(String[] args)
    {
        /* A function is a block of code that performs a specific task
        it is declared with a name, a return type, and optionally, parameters
         */

        /* Types of func:
        --> No Return type[void] with no parameter
        --> No return type[void] with parameter
        --> Return type with no parameter
        --> Return type with parameter
         */

        greet();
        SayHi(); //func calling
        how();
        what();
        SayBye();
        SayHi(); // we call func 'n' times
        SayHi();

    }

    private static void greet()
    /* The ‘void’ keyword indicates that this function does not return any value.
     Name of the func is greet() and no parameters for this func
     */
    {
        System.out.println("Hello world");
    }

    private static void how() //func defining/definition
    {
        System.out.println("Fine");
    }

    private static void what()
    {
        System.out.println("Practicing Java");
    }

    private static void SayBye()
    {
        System.out.println("Bye");
    }

    static void SayHi()
    {
         System.out.println("Hiiii....");
    }
}
