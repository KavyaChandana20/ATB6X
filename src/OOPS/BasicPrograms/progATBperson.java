package OOPS.BasicPrograms;

public class progATBperson
{
    public static void main(String[] args)
    {
        //DefaultConstructor
        ATBperson a1 = new ATBperson();
        System.out.println("*******************");

        //Parameterized constructor1
        ATBperson a2 = new ATBperson("Kavya",1234567890,"kkk@gmail.com",false,"ATB");
        System.out.println("Name : "+a2.name);
        System.out.println("Phone num : "+a2.phone );
        System.out.println("Email id : "+a2.email);
        System.out.println("Is married : "+a2.isMarried);
        System.out.println("course name " +a2.courseName);

        //Parameterized constructor2
        ATBperson a3= new ATBperson("ABC");
        System.out.println("*******************");
        System.out.println("Name : "+a3.name);

    }
}
