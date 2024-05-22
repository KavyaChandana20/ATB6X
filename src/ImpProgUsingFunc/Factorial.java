package ImpProgUsingFunc;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a num : "); //5
        int n = sc.nextInt();
        Fact(n);
    }

    public static int Fact(int p)
    {
        int fact=1;
        for(int i=1;i<=p;i++)
        {
            fact= fact*i;
        }
        System.out.println("Factorial of " +p+ " is : "+fact);
        //Factorial of 5 is : 120
        return fact;
    }
}
