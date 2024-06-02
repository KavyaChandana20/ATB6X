package Collections.lists.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class prog4
{
    public static void main(String[] args)
    {
        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(75);
        myMakrs.add(95);
        myMakrs.add(60);
        myMakrs.add(80);
        myMakrs.add(57);
        Collections.sort(myMakrs); // sorts in ascending order --> 57 60 75 80 95
        System.out.println(myMakrs);

    }
}
