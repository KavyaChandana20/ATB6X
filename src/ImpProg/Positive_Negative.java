package ImpProg;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num : ");
        int num = sc.nextInt();

        if(num>0)
        { System.out.println(num+ " is a positive num"); }

        else if (num <0 )
        { System.out.println(num+ " is a negative num"); }

        else
        { System.out.println(num+" is a nuetral num "); }

    }
}
