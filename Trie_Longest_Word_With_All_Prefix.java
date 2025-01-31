import org.w3c.dom.Node;

public class Trie_Longest_Word_With_All_Prefix {
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

    public static String ans = " ";

    public static void LongestWord(Node root, StringBuilder temp) {
        if (root == null)
            return;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a')); // 1
                if (temp.length() > ans.length()) { // 2
                    ans = temp.toString();
                }
                LongestWord(root.children[i], temp); // 3
                temp.deleteCharAt(temp.length() - 1); // 4

            }

        }
    }

    public static void main(String args[]) {
        String words[] = {  "a","banana","app","appl","ap","apple" };
        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }
        LongestWord(root,new StringBuilder(" "));
        System.out.println(ans);
 
    }
}
