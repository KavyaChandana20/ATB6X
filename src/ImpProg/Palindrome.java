package ImpProg;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check whether it is a Palindrome or not");
        String a = sc.next();

        StringBuilder sb = new StringBuilder(a);
        String rev = sb.reverse().toString();
        /*
         we don't have reverse func in string,Only StringBuilder has reverse func
        reverse func return only StringBuilder, so we have to convert StringBuilder to string [toString()]
        */

        if(a.equalsIgnoreCase(rev))
        {
            System.out.println("Yep "+ a +" is a Palindrome");
        }
        else
        {
            System.out.println("Nope!! "+ a +" is not a Palindrome");
        }
    }
}
