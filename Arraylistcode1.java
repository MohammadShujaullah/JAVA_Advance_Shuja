import java.util.ArrayList;
import java.util.Collections;

public class Arraylistcode1 {
    public static void main (String args []){ // arraylist only for object and class object like 
                                               //Integer,Float,Boolean,String 
   ArrayList<Integer>list=new ArrayList<>();

       // add elements in arraylist 
       list.add(0);
       list .add(2);
       list .add (3);
    System.out.println(list);    

    //get the element 
    int elemt=list.get(1);    //get(1)where 1  is idx
    System.out.println(elemt);
    
    //add element in between 
    list .add (1,1);
    System.out.println(list );

    //set element or change elemrnt
    list .set (0,5);
    System.out.println(list);

    //delete element 
    list .remove (2);
    System.out.println(list );


    //size getting 
    int size=list .size();
   System.out.println(size);

   //loop in arraylist to get the list 
   for (int i=0;i<list .size();i++){
    System.out.print(list.get(i));
   }
   System.out.println();
   // sorting in arreylist 
   Collections.sort(list);   //we have to import collection class 
   System.out.println(list);

                                      
    }
}
