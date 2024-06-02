package Collections.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Treemap
{
    public static void main(String[] args)
    {

        Map<String,Integer> m = new TreeMap<>();

        m.put("id",1);
        m.put("id2",3);
        m.put("id3",6);
        System.out.println(m);
    }
}
