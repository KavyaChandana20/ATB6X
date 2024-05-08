package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter a second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter a name : ");
        String str = sc.next();

        sum(n1,n2);
        sub(n1,n2);
        mul(n1,n2);
        sayhello(str);
    }

    private static String sayhello(String name) {
        String s = "";
        System.out.println("Hello " + name);
        return s;
    }

    static int sum(int a, int b)
    {
        int res= a+b;
        System.out.println("Sum of two numbers is : "+res);
        return res;
    }

    static int sub(int a, int b)
    {
        int res= a-b;
        System.out.println("Sub of two numbers is : "+res);
        return res;
    }

    static int mul(int a, int b)
    {
        int res= a*b;
        System.out.println("mul of two numbers is : "+res);
        return res;
    }
}
