import java.util.HashSet;
public class HashSet_ImplementationByImport {
    public static void main(String[] args) {
        HashSet<String> st= new HashSet<>(); // only unique element can goes inside it
         st.add("aman");
         st.add("shuja");
         st.add("sonam");

         System.out.println(st);
         System.out.println(st.size());
         st.remove("aman");
         System.out.println(st);
         System.out.println(st.size());
         st.add("sania");


         for(String s : st){
            System.out.println(s);
         }
        






    }
}
