package Collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashMap2
{
    public static void main(String[] args)
    {
        Map<String, String> m1 = new HashMap();
        m1.put("firstName", "Kavya");

        m1.put("email", "kkk@gmail.com");
        m1.put("phone", "1234567890");
        m1.put("city", "Pune");
        m1.put("state", "MH");
        m1.put("country", "India");
        m1.put("zip", "411057");
       System.out.println("map m1 data : "+m1);

        Map<String, String> m2 = new HashMap();
        m2.put("firstName", "CCC");
        m2.put("email", "ccc@gmail.com");
        m2.put("phone", "1234567890");
        m2.put("city", "Pune");
        m2.put("state", "MH");
        m2.put("country", "India");
        m2.put("zip", "411057");
        System.out.println("map m2 data : "+m2);

        ArrayList list = new ArrayList();
        list.add(m1);
        list.add(m2);
        System.out.println(list); // {m1 data},{m2 data}
        System.out.println(list.get(0)); //m1 data
        System.out.println(list.get(1)); //m2 data
    }
}
