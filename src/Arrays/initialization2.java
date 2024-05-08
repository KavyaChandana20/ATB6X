package Arrays;

public class initialization2 {
    public static void main(String[] args) {

        int[] ages2 = new int[5];
        //Here by default value of all the elements will be 0
        System.out.println("Before initialzing a value : "+ages2[1]);  //0
        System.out.println("Before initialzing a value : " +ages2[4]); // 0

        ages2[1] = 11;
        System.out.println("After initialzing a value : "+ages2[1]); // 11

        ages2[1] = 6;
        ages2[1] = 7; // overwrites 6 and prints 7
        System.out.println("After initialzing a value : "+ages2[1]); //7

        System.out.println(ages2[6]); // Error ->  java.lang.ArrayIndexOutOfBoundsException
        System.out.println(ages2[-1]); // Error -> java.lang.ArrayIndexOutOfBoundsException

    }
}
