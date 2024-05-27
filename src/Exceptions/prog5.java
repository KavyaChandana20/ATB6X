package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class prog5
{
    public static void main(String[] args) throws FileNotFoundException {
        readFile("C://a.txt");
        System.out.println("Throws works with func & checked exceptions");
        System.out.println("Try & catch works with both checked & unchecked any with any variable");

    }

    static void readFile(String fileName) throws FileNotFoundException {
        int a = 10 / 10;
        int c =0;
        // int a1 = 10 / c;
//        try {
//            FileReader f = new FileReader(new File("C://a/txt"));
//        }
//        catch (Exception e){
//            System.out.println("File not found!");
//        }

        FileReader f = new FileReader(new File("C://a/txt"));

    }
}

