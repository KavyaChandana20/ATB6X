package string;

public class stringProg3 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // Stored in string constant pool [SCP]
        String name1 = "The Testing Academy"; // SCP
        String name2 = new String("The Testing Academy"); // Stored in Heap area (Obj Area)

        System.out.println(name == name1);
        // Check the Ref/address --> returns true as they have content they ill point same address

        System.out.println(name.equals(name1));
        // Check the Values/content --> returns true


        System.out.println(name == name2);
        // returns false --> name stored in scp & name2 in obj area. diff address

        System.out.println(name.equals(name2)); // ture

        String n1="Kavya";
        String n2="kavya";
        System.out.println(n1 == n2); // returns false
        System.out.println(n1.equals(n2)); // returns false --> K in n1 is upper case



    }
}
