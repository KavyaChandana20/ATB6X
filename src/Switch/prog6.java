package Switch;

import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {

        // Program to Check Grade Based on Marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        //  90 ->  90/10 -> 9 -> A ( 90-100) -> A
        //  87 ->  87/10 -> 8 -> B (80-89) -> B
        //  77 ->  77/10 -> 7 -> C ( 70-79) -> C

        marks = marks/10;
        System.out.println("GPA is : "+marks);

        switch (marks){
            case 10: // 100/10 =10
                System.out.println("A");
                break;
            case 9: // 90/10 =9
                System.out.println("A");
                break;
            case 8: // 80/10 =8
                System.out.println("B");
                break;
            case 7:  // 70/10 =7
                System.out.println("C");
                break;
//            case 1:
//                System.out.println("F");
//                break;
            default:
                System.out.println("Fail");
        }
    }
}
