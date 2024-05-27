package Enum;

public class Days
{
    public static void main(String[] args)
    {
        Day d = Day.SUNDAY;
        System.out.println(d);
    } //psvm
} //Days

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}