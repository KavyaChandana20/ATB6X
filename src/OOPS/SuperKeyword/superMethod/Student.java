package OOPS.SuperKeyword.superMethod;

public class Student extends Person{
    void std()
    {
        System.out.println("I am Student");
    }

    void display()
    {
        this.std(); //current class method
        super.per(); //parent class method
    }


}

