package BasicProg;

import java.util.Scanner;

public class charProg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter : ");
        char l = sc.next().charAt(0);

        if (l == 'a' || l == 'e' || l == 'i' || l== 'o' || l == 'u' ||

                l== 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U')

        { System.out.println(l+ " is a vowel"); }

        else
        { System.out.println(l+ " is a  consonant"); }

        sc.close();
    }
}
