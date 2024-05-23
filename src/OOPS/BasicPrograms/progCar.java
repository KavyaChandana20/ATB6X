package OOPS.BasicPrograms;

public class progCar {
    public static void main(String[] args) {
        Car c= new Car();
        c.name="Tesla";
        c.model="Model 1";
        c.color="Mutard";

        c.reverse();
        c.Topspeed();
        c.musicSystem();

        System.out.println("Car name is : "+c.name);
        System.out.println("Car model is : "+c.model);
        System.out.println("Car color is : "+c.color);

        System.out.println("*********");
        Car c1= new Car();
        c1.name="Benz";
        c1.reverse();
        c1.Topspeed();
        c1.musicSystem();

        System.out.println("Car name is : "+c1.name);

    }
}
