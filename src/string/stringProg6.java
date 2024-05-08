package string;

public class stringProg6 {
    public static void main(String[] args) {
        String password  = "Kavya@123";
        String pass_u = password.toLowerCase();
        // pass_u == password --> false
        // pass_u.equals(password) -> false
        // pass_u.equalsIgnoreCase(password) -> True , remove case senitivity
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));


        System.out.println(password.substring(0,3));
        //Kav -->prints upto 2nd index value, it excludes 3rd index value

        System.out.println(password.indexOf("a"));
    }
}
