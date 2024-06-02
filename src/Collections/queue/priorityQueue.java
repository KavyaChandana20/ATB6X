package Collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue
{
    public static void main(String[] args)
    {
        Queue pq1 = new PriorityQueue();
        // FIFO
        pq1.add("B");
        pq1.add("A");
        pq1.add("C");
        pq1.add("C");
        pq1.offer("D"); //Add
        //pq1.offer(null); //Null is not supported as it has auto sort method

        System.out.println(pq1); // [A, B, C, C, D]

        System.out.println(pq1.poll()); //removes the 1st element --> A
        System.out.println(pq1);  // [B, C, C, D]
        System.out.println(pq1.peek()); // B
        System.out.println(pq1); // [B, C, C, D]


        Iterator iterator = pq1.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " "); //B C C D
        }
    }
}
