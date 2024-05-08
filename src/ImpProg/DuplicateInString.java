package ImpProg;

import java.util.Scanner;

public class DuplicateInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String a = sc.next();
        char[] c = a.toCharArray(); //toCharArray() converts the string into a sequence of characters.
        int count=0;

        for (int i = 0; i < a.length(); i++)
        {
            for (int j = i + 1; j < a.length(); j++)
            {
                if (c[i] == c[j])
                {
                    System.out.print(c[j] + " ");
                    break;
                }
            }
        }


    }
}
