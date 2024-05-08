package if_else;

import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score : ");
        int score = sc.nextInt();

        if(score >=90 && score <=100){
             System.out.print("Wow!! its Grade A");
        }
        else if(score >=80 && score <=89)
        { System.out.print("Good its Grade B"); }

        else if (score >= 70 && score <= 79)
            { System.out.print("Grade C");}

        else if (score >= 60 && score <= 69)
            { System.out.print("Grade D"); }

        else if ( score >=0 && score <= 59)
       { System.out.println("Grade F"); }

        else {  System.out.println("Enter a valid score"); }

        sc.close();
    }
}
