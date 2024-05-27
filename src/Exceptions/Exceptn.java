package Exceptions;

public class Exceptn
{
    public static void main(String[] args)
    {
        System.out.println("Exceptions are 2 type: Checked & Unchecked");
        System.out.println("Checked --> Compile time  - JVM knows about it. while writing the code it shows errors in red line");
        System.out.println("Unchecked --> Runtime  - JVM dont know about it .Errors will be known after running the code");
        System.out.println();

        String sh = args[0]; // 5 --> click on 3dots --> edit-->enter a value in prog argument
        int x = Integer.parseInt(sh); // (String)5 -> 5(int) // int x = 5
        int a = 10/x; // 10/5 -> 2 // java.lang.ArithmeticException
        System.out.println(x);
        System.out.println(a);

        // diff kind of Exceptions:
        // No Input entered in prog argument --> java.lang.ArrayIndexOutOfBoundsException
        // 0 --> java.lang.ArithmeticException
        // AAA - java.lang.NumberFormatException
        // 3.45 - java.lang.NumberFormatException
        // @@#$%^&^%$#% - java.lang.NumberFormatException

        /* NumberFormatException
           ArrayIndexOutOfBoundsException
           ArithmeticException */

        // 5 --> executes successfully
        // -5 --> executes successfully

/* Flow of the program
        JVM will be Initialized
        Creates and Starts the main Thread.
        main Thread will do the following tasks
        1)Collects the Command Line Arguments
        2)Creates the String array with CLA
        3)Calls main method by passing String array as Parameter:
         Exceptn.main(5)
        Now Control will be transferred from main Thread to main method
        Control will come back to main thread in two ways.
        A)When problem comes in main -> JVM
        Creates the Object of Identified Exception class.
        Exception a=new Exception()

 */


    }
}
