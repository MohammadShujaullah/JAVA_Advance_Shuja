import java.util.*;

public class Hashset_LinkedHashset_treeset_example {
    public static void HashsetExample() {
        HashSet<Integer> st = new HashSet<>();
        st.add(1); // unordered,unique all element.
        st.add(2);
        st.add(3);
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
        st.add(1); // unordered,unique all element.
        st.add(2);
        st.add(3);
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
        treeSet<Integer> st = new treeSet<>();
        st.add(1); // unordered,unique all element.
        st.add(2);
        st.add(3);
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

    }
}
