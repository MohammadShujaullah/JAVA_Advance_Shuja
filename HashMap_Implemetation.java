import java.util.*; 

public class HashMap_Implemetation {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        public class Node { // linkedlist node to store key and value.
            K key;
            V value;

            Node(K key, V value) {

            }

        }

        private int n; // the no. of entries in map.
        private LinkedList<Node>[] buckets;     // ye ek array ha ,jiska type LikedList ha ,

        // saare buckets ke indx pr new linked list rakho
        private void initbuckets(int N) { // N is the capacity /size of bucket array
            buckets = new LinkedList[N]; // deciding size of bucket

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();

            }
        }

        private int Hashfunc(K key) {
            int hc = key.hashCode(); // key.hashcode() directly gives a hash code by default
                                     // but the code may be out of range or negative.
                                     // so we use math.absolute and divide by length
            return (Math.abs(hc)) % buckets.length;

        }

        // traverse a linklist and look for a node with key,if
        // found then return its index otherwise retyrns null

        private int searchInBuckets(LinkedList<Node> LL, K key) {
            
            for (int i = 0; i < LL.size(); i++) {
                if (LL.get(i).key == key) {
                    return i;

                }

            }
            return -1;

        }
        @SuppressWarnings("unchecked")
        public MyHashMap() {
            initbuckets(DEFAULT_CAPACITY);
        }

        public int size() { // return the no. of entries in the map
            return n;
        }

        public void put(K key, V value) {
            int bi = Hashfunc(key);

            LinkedList<Node> currBuckets = buckets[bi];

            // now traverse over linkedlist
            int ei = searchInBuckets(currBuckets, key);

            if (ei== -1) { // key doesnt exit ,we have to insert a node
                Node node = new Node(key, value);
                currBuckets.add(node);
                n++;
            } else { // update case
                Node currNode = currBuckets.get(ei);
                currNode.value = value;
            }

        }

        public V get(K key) {
            int bi = Hashfunc(key);

            LinkedList<Node> currBuckets = buckets[bi];

            // now traverse over linkedlist
            int ei = searchInBuckets(currBuckets, key);

            if (ei!= -1) {// it exist
                Node currNode = currBuckets.get(ei);
                return currNode.value;

            } 
            // key doesnt exit
            return null;

        }

        public V remove(K key) {
            int bi = Hashfunc(key);

            LinkedList<Node> currBuckets = buckets[bi];

            // now traverse over linkedlist
            int ei = searchInBuckets(currBuckets, key);

            if (ei== -1) {// it exist
                Node currNode = currBuckets.get(ei);

                V val = currNode.value;
                currBuckets.remove(ei);
                return val;
                 
            } else {
                // not exist
                return null;

            }

        }

    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("testing map");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        System.out.println(mp.size());
        mp.put("c", 30);
        System.out.println(mp.size());
        mp.put("a",20);
        System.out.println(mp.size());

    }
}
