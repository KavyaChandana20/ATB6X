package ImpProgUsingFunc;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array entered by user: " + Arrays.toString(array));

        // Maximum in Array
        System.out.println("Maximum in the array: " + findMax(array));
    }

    public static int findMax(int[] array)
    {
        int max = Integer.MIN_VALUE;
        for (int num : array)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }


}
