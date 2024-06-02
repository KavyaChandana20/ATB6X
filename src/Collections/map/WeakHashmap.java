package Collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmap
{
    public static void main(String[] args)
    {
        Map<String,Integer> m = new WeakHashMap();

        m.put("id",1);
        m.put("id2",2);
        m.put("id3",3);
        System.out.println(m);
    }
}
