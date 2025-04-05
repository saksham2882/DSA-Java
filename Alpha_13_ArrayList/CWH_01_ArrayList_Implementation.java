package Alpha_13_ArrayList;
import java.util.ArrayList;

class CWH_01_ArrayList_Implementation{

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // How Internally an ArrayList is Implemented :

        // ArrayList is implemented using Dynamic Array. Dynamic Array is a contiguous block of memory. 
        // It is a data structure that can grow or shrink in size as elements are added or removed. 
        // ( It means that firstly element is stored in the array (dynamic array) and as the array filled java automatically create a new array (dynamic) of size 1.5 , 2 or more and copy the element from the previous array into the new array and delete the old array. And this process run so on so... until the element added).


        // Add Element in the list :
        list.add(10);                 // O(1)
        list.add(31);
        list.add(12);
        list.add(3);
        list.add(1, 90);  // O(n)
        System.out.println(list);

        // Get Element in the List : O(1)
        // int ele = list.get(3);
        // System.out.println(ele);

        // Delete Operation : O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set Element at given Index : O(n)
        // list.set(2, 45);
        // System.out.println(list);

        // Contain Operation : O(n)
        // System.out.println(list.contains(45));
        // System.out.println(list.contains(4));

        // Size of ArrayList :
        // System.out.println(list.size());

        // Example 1 : Print ArrayList :
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + "  ");
        // }
        // System.out.println("");

        // Example 2 : Print Reverse of ArrayList : O(n)
        // for (int j = list.size() - 1; j >= 0; j--) {
        //     System.out.print(list.get(j) + "  ");
        // }
        // System.out.println(""); 
    }
}