package if_else;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num : ");
        int n1 = sc.nextInt();

        if(n1 % 2 == 0)
        { System.out.println(n1+ " is a even num"); }

        else { System.out.println(n1+ " is a odd num"); }

        sc.close();
    }
}
