import java.util.*;

public class LinklistByimportingPkges {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        // add first directly
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this ");
        list.addLast("list"); /// or we can write --> list.add("list");

        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "-->");
        }
        System.out.println("null");
        // remove first directly
        list.removeFirst();
        System.out.println(list);
        // remove last directly
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}
