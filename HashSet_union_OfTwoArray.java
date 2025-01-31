import java.util.HashSet;
public class HashSet_union_OfTwoArray {
    public static int unionofarray( int arr1[],int arr2[] ){
        HashSet<Integer> set= new HashSet <>(); // we have to return the no. of elemet 
                                                 //which is present after intersection of two array
        
        for(int el :arr1){
            set.add(el);

        } for(int el :arr2){
            set.add(el);
            
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
       System.out.println( unionofarray(arr1, arr2));
    }
    
}
