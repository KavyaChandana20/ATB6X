package Exceptions;

import java.io.FileInputStream;

public class prog1
{
    public static void main(String[] args) {
        // Checked - JVM knows -
        try
        {
            FileInputStream f = new FileInputStream("C:/log.txt");
            //--> this line throws an error if package "java.io.FileInputStream" is not imported
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        // UnChecked - JVM dont know
        int a = 10;
        int c = a/0;
        System.out.println(c);

        String s1 = null;
        s1.trim();
    }
}
