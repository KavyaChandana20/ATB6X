package ImpProg;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Finding the largest num using AND operator");
        System.out.println("Enter the Num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the Num 3");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1+" is the largest num using AND operator");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2+ " is the largest num using AND operator");
        } else {
            System.out.println(num3+" is the largest num using AND operator");
        }

        // ? ->  condition ? (if true) -> do this : if false -> do that
        System.out.println("Finding the largest num using ternary operator");
        System.out.println("Enter the Num 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the Num 2");
        int n2 = sc.nextInt();
        System.out.println("Enter the Num 3");
        int n3 = sc.nextInt();

        int A = (n1 > n2) ? n1 : n2;
        int B = (n2 > n3) ? n2 : n3;
        int largest = (n3 > n1) ? B : A;
        // if n3>n1 is true then it will check n3>n2 & if n3 is !> n1 then it will check n1>n2
        System.out.println("largest num using ternary operator is : "+largest);

        sc.close();

    }
}
