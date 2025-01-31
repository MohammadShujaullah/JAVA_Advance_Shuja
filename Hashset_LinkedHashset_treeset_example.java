import java.util.*;

public class Hashset_LinkedHashset_treeset_example { 
     public static void HashsetExample() {
        HashSet<Integer> st = new HashSet<>();
        st.add(1); // unordered,unique all element, hashing internally
        st.add(2);
        st.add(3);
        st.add(10);
        st.add(15);
        st.add(48);

        System.out.println(st);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
        System.out.println(st);

    }

    public static void Linked_Hashset() {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1); // ordered,unique all element.
        st.add(2);
        st.add(3);
        st.add(10);
        st.add(15);
        st.add(48);
        System.out.println(st);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
        System.out.println(st);

    }

    public static void tree_set() {
        TreeSet<Integer> st= new TreeSet<>();

        st.add(1); // sorted elements,unique all element.
        st.add(2);
        st.add(3);
        st.add(15);
        st.add(10);
        st.add(48);
        System.out.println(st);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
        System.out.println(st);

    }

    public static void main(String[] args) {
       // HashsetExample();
       //Linked_Hashset();
       tree_set();

    }
}
