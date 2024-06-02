package Collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class LinkedHashmap
{
    public static void main(String[] args)
    {
        System.out.println("Insertion ordered is maintained");
        Map<String,Integer> m = new LinkedHashMap<>();
        m.put("id",5);
        m.put("id2",7);
        m.put("id3",9);
        System.out.println(m);
    }
}
