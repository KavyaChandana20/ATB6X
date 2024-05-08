package Arrays;

import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the first Sub 1 Marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the first Sub 2 Marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the first Sub 3 Marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the first Sub 4 Marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the first Sub 5 Marks");
        marks[4] = sc.nextFloat();

//        for (int i = 0; i < marks.length; i++)
//        {
//            if(marks[i] < 30)
//            {
//                System.out.println("Failed " +marks[i]);
//            }
//            System.out.println(marks[i]);
//        }

        // using while loop
        int j = 0;
        while (j< marks.length)
        {
            if(marks[j] < 30)
            {
                System.out.println("Failed " +marks[j]);
            }
            System.out.println(marks[j]);
            j++;
        }

        sc.close();

    }
}
