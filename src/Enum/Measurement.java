package Enum;

public class Measurement
{
    public static void main(String[] args)
    {

        for (Size s : Size.values())
        {
            System.out.println("Size: " + s + ", Abbreviation: " + s.getSize());
        }


    }  //psvm,

} //measurement

enum Size
{
    //enum class by using constructor
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String size;

    Size(String s1)
    {
        this.size = s1;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

} //size
