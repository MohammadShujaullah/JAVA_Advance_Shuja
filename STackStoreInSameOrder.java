import java.util.*;

public class STackStoreInSameOrder {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();

        while (st.size() > 0) {
             
            rt.push(st.peek());
            st.pop();
        }
        System.out.println(rt);

        Stack<Integer>gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());

        } System.out.println(gt);
    }

}
