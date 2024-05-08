package ImpProg;

import java.util.Scanner;

public class RevereOfString {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a word : ");
         String str = sc.next();
         String rev = "";
         char ch;

        System.out.println("Original word: " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            rev = ch + rev; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + rev);
    }
}
