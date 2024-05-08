package Arrays;

public class printing_foreach {
    public static void main(String[] args) {
        int[] a = {7,5,20};

        System.out.println("using for each loop");
        for (int item :a)
        {
            System.out.print(item+ " ");
        }
        System.out.println();

        System.out.println("using for loop");
        for (int i = 0; i < a.length ; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
