package Collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Hashset2
{
    public static void main(String[] args)
    {
        // Given an array of integers, return an array of the unique elements.
        // Input: {7, 2, 2, 4, 4, 5, 3, 1}
        // Output: [1, 2, 3, 4, 5]
        int[] input = {7, 2, 2, 4, 4, 5, 3, 1};
        Set<Integer> S = new HashSet();

        for( int num:  input)
        {
            S.add(num);
        }
        System.out.println(S);
    }
}
