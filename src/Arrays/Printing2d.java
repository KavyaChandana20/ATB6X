package Arrays;

public class Printing2d {
    public static void main(String[] args) {
        int[][] a = {
                {7,  3, 10},
                {1,  5, 20},
                {25, 8, 15}
        };

       // a.length=3; 3 rows
        for (int i = 0; i < a.length; i++) // Row  0,1,2
        {
            for (int j = 0; j < a[i].length; j++) // Column , 0,1,2
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
