package if_else;

import java.util.Scanner;

public class prog1

{
    public static void main(String[] args) {
      //  int age = 13;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18 && age < 60) { System.out.println("You are Major"); }

        else if (age >= 60) { System.out.println("You are senior citizen"); }

        else{ System.out.println("You are Minor"); }
        sc.close();

    }
}
