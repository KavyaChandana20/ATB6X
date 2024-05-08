package Switch;

import java.util.Scanner;

public class prog1 {
        /*  The break statement in java is used to terminate from the loop immediately
        If break is not mentioned then the below case ill alo be executed.

        break is not required for 'default' case if wriiten at the end,
        if default cae is written at the top then we have to mention break

         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number 1-7, I will tell you day it is!");
        int day = scanner.nextInt();

        switch(day) {
            case 1:
                System.out.println("Mon!");
                break;
            case 2:
                System.out.println("Tue!");
                break;
            case 3:
                System.out.println("Wed!");
                break;
            case 4:
                System.out.println("Thur!");
                break;
            case 5:
                System.out.println("Fri!");
                break;
            case 6:
                System.out.println("Sat!");
                break;
            case 7:
                System.out.println("Sun!");
                break;
            default:
                System.out.println("only number 1-7 are allowed");

        }

       // System.out.println(" -- End of the program, I will be executed anyhow!! --");

        scanner.close();
    }
}
