package OOPS;

import java.util.Arrays;

public class progPerson {
    public static void main(String[] args)
    {
        person k = new person();
        // ClassName Object_ref = new ClassName()
        // new ClassName() is Object
        k.name = "Kavya";
        k.address= new String[]{"Hyd","TS"};
        k.age=4;
        k.dob="20-OCT-2020";
        k.height=5.0;
        k.isMale=false;
        k.salary=100000.5f;

        System.out.println("Name is : "+k.name);
        System.out.println("Address is : "+ Arrays.toString(k.address)); // [Hyd, TS]
        System.out.println("Address is : "+ k.address); // gives the location where thr string is stored
        System.out.println("Age is : "+k.age);
        System.out.println("DOB is : "+k.dob);
        System.out.println("Height is : "+k.height);
        System.out.println("is Male : "+k.isMale);
        System.out.println("Salary is : "+k.salary);

    }
}
