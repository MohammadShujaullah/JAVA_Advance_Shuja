import org.w3c.dom.Node;

public class Trie_Count_Unique_SubString {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(n)
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){  //check the all index of arr at root and  also for its all children
            if(root.children[i]!=null){
                count+= countNode(root.children[i]);
            }

        }
        return count+1;
    }
  //to calculate the unique substring ,1st we take all suffix of string ,insert all suffix in trie ,
  //then count the no. of the node in trie  which is equal top the unique substring no.
      public static void main(String args[]) {
        String s= "ababa";
        for(int i=0;i<s.length();i++){
            String saffix= s.substring(i);
            System.out.println(saffix);
            insert(saffix);
            
        }
        System.out.println(countNode(root));
        System.out.println();
        System.out.println(Math.ceil(10/3.0));
    }
}