
import java.util.*;
public class Queue_deque {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
       dq.addLast(1);
       dq.addLast(2);
       dq.addLast(3);
       dq.addLast(2);
       dq.addLast(5);
       dq.addLast(5);
       dq.addLast(5);
       dq.addLast(5);
       dq.removeFirst();
       dq.removeLast();
       dq.removeFirstOccurrence(2);

        System.out.println(dq);

    }
}
