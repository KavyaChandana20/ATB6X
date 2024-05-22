package ImpProg;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num : "); //321
        int n = sc.nextInt();
        int rem=0,rev=0;

        for (int i =0; i<3;i++) // if i<=3 is given then it will print 0 at end as it has length upto 4[0-3]
        {
            rem = n%10;
            rev= rev *10 + rem;
            n = n/10;
        }
        System.out.println("Reverse of a num is : " +rev); //123

    }
}
