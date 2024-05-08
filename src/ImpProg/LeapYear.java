package ImpProg;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //  Leap Year Program - 2024
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year: ");
        int year = sc.nextInt();

        // 2024, 2000, 1600

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        { System.out.println(year+ " is a leap Year! "); }
        else
        { System.out.println(year+ " is not a Leap Year!"); }

        sc.close();
    }
}
