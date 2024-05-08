package Arrays;

public class FindMax {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        int[] salaries = {30, 50, 60, 90, 10, 100, 999, -1, -2};

        int max_salary = Integer.MIN_VALUE; //-2147483648
        /* integer range --> -2147483648 to 2147483647
        instead of declaring a value we used MIN_VALUE
        so that even if the negative values are given in array list we can get correct value
         */

        for (int i = 0; i < salaries.length; i++)
        {
            if (salaries[i] > max_salary)  // 30 > -2147483648 --> no, max =30; next 50>30--> yes , max=50
            {
                max_salary = salaries[i];
            }
        }
        System.out.println("Max Sal -> " + max_salary);

        //using while loop
//        int j = 0; // j=9
//        while (j < salaries.length)
//        {
//            if (salaries[j] > max_salary)
//            {
//                max_salary = salaries[j];
//            }
//            j++;
//        }
//        System.out.println("Max Sal -> " + max_salary);

    }
}
