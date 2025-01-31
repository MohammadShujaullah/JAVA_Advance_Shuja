import java.util.Stack;

public class STackRemoveConsicutiveSubsequence {
    public static int [] reverse(int arr[]){
        Stack<Integer>st= new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(st.size()==0|| st.peek()!=arr[i]){
                st.push(arr[i]);

            }
            else if (st.peek()==arr[i]){
                if ( arr[i]!=arr[i+1] || i=n-1  ){    // not correct because one type is boolean and another type is int 
                    st.pop();
                }
            }

        }  
        int res[]=new int [st.size()];

        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();

          
        }
 return res;
        }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 7, 2 };
        int res[] = reverse(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
