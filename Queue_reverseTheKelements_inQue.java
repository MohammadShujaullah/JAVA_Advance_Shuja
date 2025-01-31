import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Queue_reverseTheKelements_inQue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        int k = 3;
        int n = q.size();
        for(int i=1;i<=k;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());

        }
        for(int i=1;i<=n-k;i++){
            q.add(q.remove());
        }
        
        System.out.println(q);
    }
}
