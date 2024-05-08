package ImpProg;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Num : ");
        int num = sc.nextInt();

        System.out.println("Printing Fizz");
        for(int i=1; i<=num; i++)
        {
            if(i % 3 ==0)
            {
                System.out.println(i+ " is Fizz");
            }
        }

        System.out.println("Printing Buzz");
        for(int j=1; j<=num; j++)
        {
            if(j % 5 ==0)
            {
                System.out.println(j+ " is Buzz");
            }
        }

        System.out.println("Printing FizzBuzz");
        for(int k=1; k<=num; k++)
        {
            if(k % 3 ==0  && k%5==0)
            {
                System.out.println(k+ " is FizzBuzz");
            }
        }

    }
}
