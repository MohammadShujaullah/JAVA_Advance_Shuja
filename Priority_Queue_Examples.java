import java.util.*;

public class Priority_Queue_Examples {
    public static void MinPriorityQueue(){
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default min priorityqueue
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

    }
    public static void MaxPriorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // by default min priorityqueue
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

    }
    public static void main(String[] args){
        MinPriorityQueue();
        MaxPriorityQueue(); 

    






    }

}
