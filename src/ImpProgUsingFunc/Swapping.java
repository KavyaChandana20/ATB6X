package ImpProgUsingFunc;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num : ");
        int n1= sc.nextInt();

        System.out.println("Enter second num : ");
        int n2= sc.nextInt();

        System.out.println("The value of n1 before swapping is : " +n1);
        System.out.println("The value of n2 before swapping is : " +n2);

        swap( n1, n2);
        swap2( n1, n2);
    }

    public static void swap(int n1, int n2)
    {
         n1= n1+n2;
         n2= n1- n2;
         n1= n1-n2;
        System.out.println("The value of n1 after swapping is : " +n1);
        System.out.println("The value of n2 after swapping is : " +n2);
    }

    public static void swap2(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: n1 = " + n1 + ", n2 = " + n2);
    }


}
