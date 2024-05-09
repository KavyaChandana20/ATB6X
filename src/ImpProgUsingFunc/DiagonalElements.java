package ImpProgUsingFunc;

public class DiagonalElements
{
    public static void main(String[] args)
    {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Diagonal elements of the 2D array:");
        printDiagonal(a);
    }

    public static void printDiagonal(int[][] a)
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i][i] + " ");
        }
        System.out.println();
    }
}

