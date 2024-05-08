package string;

public class BuilderBuffer {
    public static void main(String[] args) {
        String s1 = "Kavya"; //SCP
        String s2 = new String("Kavya"); // OA

        // String  - Immutable -> Once created can't be changed.

        StringBuffer a = new StringBuffer("Kavya");
        a.append("Chandana");

        System.out.println("String Buffer is : "+a); // KavyaChandana
        a.reverse();
        System.out.println("Reverse is : "+a); //anadnahCayvaK

        StringBuilder b = new StringBuilder("Kavya");
        b.append("Chandana");
        System.out.println("String Builder is : "+b);
    }
}
