import java.util.*;

public class QueueByInbuilt {
   public static void main(String[] args) {
    Queue<Integer> q= new LinkedList<>();
    System.out.println(q.isEmpty());
    
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);       // push =add,pop=remove,peek=peek;
    q.add(5);
    System.out.println(q.size());
    

    System.out.println(q);
    q.remove();
    q.poll();
    System.out.println(q); 


    
    Queue<Integer> helper=new ArrayDeque<>();
    while(q.size()>0){
        System.out.println(q.peek());
        helper.add(q.remove());
    }
    while(helper.size()>0){
        q.add(helper.remove());

    }
    



   }
    


}
