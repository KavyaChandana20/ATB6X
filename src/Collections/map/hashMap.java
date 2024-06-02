package Collections.map;

import java.util.HashMap;
import java.util.Map;

public class hashMap
{
    public static void main(String[] args) {
        // Map - key value pair
        // API Testing - JSON - JavaScript Object Notation - Map
        // JSON - key value pair
        System.out.println("Hash map is unsorted & unordered");
        Map<String, Object> m = new HashMap();

        m.put("name", "Kavya");
        m.put("age", 18);
        m.put("roll", 1);
        m.put("course", "ATB");
        m.put("isMale", false);
        System.out.println(m);
        System.out.println(m.get("name")); //Kavya
        System.out.println(m.get("age")); //18
        System.out.println(m.isEmpty()); //false
        System.out.println(m.containsKey("age")); //true
        System.out.println(m.containsValue(18)); //true
        System.out.println(m.keySet()); //[isMale, name, roll, course, age]
        System.out.println(m.values()); //[false, Kavya, 1, ATB, 18]

        for(Map.Entry<String,Object> item: m.entrySet())
        {
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        /*
        isMale : false
        name : Kavya
        roll : 1
        course : ATB
        age : 18
         */




    }
}
