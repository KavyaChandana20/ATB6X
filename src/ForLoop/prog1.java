package ForLoop;

public class prog1 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println("i value is : " + i);
        }

        for (int j = 5; j >= 0; j--) {
            System.out.println("j value is : " + j);
        }

        for (int k = 1; k <= 10; k++)
        {
            System.out.println("k value is : "+k);
            // 1 to 10
            if (k == 5) // when k value becomes 5 it will stop printing --> output - 1 2 3 4 5
            { break; }
        }
    }
}
