package Arrays;

public class prog1 {
    public static void main(String[] args) {
        // ==  -> Refernce/ location
        // .equals() -> Refernce/ location
        // both of them check for ref/loc in array

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1); //  prints the location  --> [I@7b23ec81
        System.out.println(arr2); //  prints the location --> [I@6acbcfc0
        System.out.println(arr1==arr2); //false

        int[] arr3 = arr1;
        System.out.println(arr1==arr3); // true

        System.out.println(arr1.equals(arr2)); //Objects.Java - ref. --> false


    }
}
