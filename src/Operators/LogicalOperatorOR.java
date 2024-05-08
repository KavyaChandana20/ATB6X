package Operators;
import java.util.Scanner;

public class LogicalOperatorOR {
    public static void main(String[] args)
    {
        int a = 12;
        boolean b = !(a > 10 || a < 5); // returns false --> !(true) is false
        System.out.println(b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();

        if (n1 > 10 || n1<30 )
          { System.out.println("true"); }
        else  { System.out.println("flase"); }

        sc.close();
    }
}
