import java.util.*;

public class LinklistproblemTwo {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values of no. range is 1-50,give 7 nos");
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        for (int i = list.size()-1;i>=0; i--) {   // time complexity is O(n^2)
            if (list.get(i) > 25) {
                list.remove(i);                 //to make the time O(n),we have to use ;LISTITTERATOR
               
            }   
            

        }  
        System.out.println(list);

    }
}
