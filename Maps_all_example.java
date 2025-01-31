import java.util.HashMap;

public class Maps_all_example {
    public static void Hash_mapExample(){

        //unordered
        HashMap<Integer,String>mp =new HashMap<>();
        mp.put(3,"aman");         //(keys, values) pattern 
        mp.put(1,"rohan");
        mp.put(2,"riya");
        mp.put(1,"priya");   // over rides the privious value.but if you dont want to over ride
        System.out.println(mp);
        mp.putIfAbsent(1, "mohan"); //    if MOHAN is not present in the maP then it add mohan in the map (to avoid over ride.)
        System.out.println(mp);

        System.out.println(mp.entrySet());  ///simply print mp.

        System.out.println(mp.get(2));    // value corrsponding to this key.


        System.out.println(mp.containsKey(4));  // boolean
        System.out.println(mp.containsValue("riya"));   // boolean

        System.out.println(mp.keySet());
        System.out.println(mp.values());


        //iterating over keys in a map
        for(var i: mp.keySet()){
            System.out.print(i+ " ,")  ; 
        } 
        System.out.println();


        
        ////iterating over values in a map
        for(var i: mp.values()){
            System.out.print(i+ " ,") ;   
        }
        System.out.println();

        ///iterating over key,values in a map
        for(var i: mp.entrySet()){
            System.out.println("the name of  roll no. "+ i.getKey()+" is "+ i.getValue());
        }System.out.println();
         System.out.println(mp.remove(3));  // we can remove the element by putting key inside remove
         System.out.println(mp);

    }


    public static void Linked_Hashmap(){
        // same code as above

        //ordered insertion
    }

    public static void tree_Map(){
        // same code as above

        //sorted insertion 
    }

    
    public static void main(String[] args) {
        Hash_mapExample();
    }
}
