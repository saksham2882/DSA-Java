package Alpha_22_Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWH_2_HashMap_Implementation {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;                                    // No. of Nodes
        private int N;
        private LinkedList<Node> bucket[];                // Array of Linked List
        
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();      // Creating LinkedList in each buckets.
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % bucket.length;          // covert hashCode into absolute value (+ve value)
        }
        
        private int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = bucket[bucketIndex];
            int dataIndex = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return dataIndex;
                }
                dataIndex++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            // old nodes -> add in new bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        

        // Put Operation:    O(lambda) -> O(1)
        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);              // index in range 0 to 3
            int dataIndex = searchInLL(key, bucketIndex);     // if node exist -> valid index return otherwise -1

            if (dataIndex != -1) {
                Node node = bucket[bucketIndex].get(dataIndex);
                node.value = value;
            } else {
                bucket[bucketIndex].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) { // let threshold value be 2.0
                reHash();
            }
        }
        
 
        // isContains Operation:  O(1)
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);            // index in range 0 to 3
            int dataIndex = searchInLL(key, bucketIndex);   // if node exist -> valid index return otherwise -1

            if (dataIndex != -1) {
                return true;
            } else {
                return false;
            }
        }


        // Get Operation:  O(1)
        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);   // if node exist -> valid index return otherwise -1

            if (dataIndex != -1) {
                Node node = bucket[bucketIndex].get(dataIndex);
                return node.value;
            } else {
                return null;
            }
        }
        

        // Remove Operation:  O(1)
        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);   // if node exist -> valid index return otherwise -1

            if (dataIndex != -1) {
                Node node = bucket[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            } else {
                return null;
            }
        }
        

        // Return all KetSet collection:
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }


        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 70);
        hm.put("Nepal", 10);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}