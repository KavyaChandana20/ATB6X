package Collections;

class Generics
{
    public static void main(String[] args) {
        printF(3,4);
        printF("Kavya","Ch");
        printF(true,false);
        printF(3.12,4.34);
    }

    private static <T> void printF(T i, T i1) {
        System.out.println(i);
        System.out.println(i1);

        /* output
        3
        4
        Kavya
        Ch
        true
        false
        3.12
        4.34
         */
    }
}

