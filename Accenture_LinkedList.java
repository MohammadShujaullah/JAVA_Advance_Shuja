import java.util.LinkedList;
import java.util.*;

public class Accenture_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.contains(3));// true
        System.out.println(list.contains(4));// false

        // add first and last
        list.addFirst(0);
        list.addLast(7);

        // remove
        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(3));

        // list.remove(2);// remove by index

        list.remove(); // remove thew first ewlement

        System.out.println(list.get(1));

        // update
        list.set(1, 8);

        System.out.println(list.size());

        System.out.println(list);

    }
}
