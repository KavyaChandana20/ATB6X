package Operators;

public class unary {

    /* This operator can be used to convert a positive value to a negative one.
    +,-, ++.--,~ are unary operators  */

    public static void main(String[] args) {
        int n1= 20;
        System.out.println("number is : " + n1);

        //performing unary operation
        n1= -n1; // or we can also write int n2=-n1; sop(n2)
        int result = n1;
        System.out.println("unary number is : " +result);

        System.out.println(".....................");
        int a1 = +25;
        int a2 = -15;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("a1+a2 is :" +(a1+a2)); //10
        System.out.println("a1-a2 is :" +(a1-a2)); //40

    }
}
