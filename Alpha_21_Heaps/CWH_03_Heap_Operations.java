package Alpha_21_Heaps;

import java.util.ArrayList;

public class CWH_03_Heap_Operations {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Insert a new node(element) in heap (Min Heap):   // O(n)
        public void add(int data) {
            arr.add(data);                                  // add at last index

            int x = arr.size() - 1;                         // child index
            int par = (x - 1) / 2;                          // parent index

            while (arr.get(x) < arr.get(par)) {             // O(log n)
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // Peek Operation: O(1)
        public int peek() {
            return arr.get(0);
        }

 
        // Remove Operation: delete min heap (minimum element)  :  O(log n)
        public int remove() {
            int data = arr.get(0);

            // Step 1: swap first & last 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2: remove last element
            arr.remove(arr.size() - 1);

            // Step 3: Heapify for fixing heap
            heapify(0);

            return data;
        }

        // Heapify: O(log n)
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndex = i;

            // check for min element
            if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
                minIndex = right;
            }

            // Swap if minimum Element is not root
            if (minIndex != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                // call for further child for fixing the heap property
                heapify(minIndex);
            }
        }
        
        // Empty Operation:
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        System.out.println(hp.arr);
        hp.add(3);
        System.out.println(hp.arr);
        hp.add(4);
        System.out.println(hp.arr);
        hp.add(5);
        System.out.println(hp.arr);
        hp.add(10);
        System.out.println(hp.arr);
        hp.add(1);

        System.out.println(hp.arr);

        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}