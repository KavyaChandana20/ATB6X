package Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[] array_1d = {450, 50, 321};

        // 2D - arrays
        // Matrix - Row and Columns

        int[][] a2 = new int[3][3];
        // |0,0,0|
        // |0,0,0|
        // |0,0,0|

        a2[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|

        a2[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|

        for (int i = 0; i < a2.length; i++)  // Row
        {
            for (int j = 0; j < a2[i].length; j++) // Column
            {
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
