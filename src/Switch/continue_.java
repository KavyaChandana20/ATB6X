package Switch;

public class continue_ {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { // 10 Times, i 0 to 9
            System.out.println(i);

            if (i == 2)
            { continue; }
            // when continue i ued it will not go out of the for loop

            System.out.println("After!!");
            /*
            1
           After!!
            2
            3
            After!!
            4
            After!!
             */
        }
    }
}
