package Alpha_13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CWH_04_Sorting {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // Add Element in the list :
        list.add(10);                   // O(1)
        list.add(31);
        list.add(12);
        list.add(3);
        list.add(1, 90);    // O(n)
        System.out.println(list);
        
        // Sorting an ArrayList :
        // Collections.sort(list); here (Class.method(object));
        // Collections vs Collection : Collection is an interface and Collections is a class.

        Collections.sort(list);           // Sort in Ascending order.
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        // here Collections.reverseOrder() is a Comparator.
        // Comparator : It is a function that handles and manage how the sorting perform. It can also be apply to the objects. 
        // It is used to order the objects of class objects (user-defined classes). We can change the ordering of elements in a collection by using Comparator interface.
        System.out.println(list);

    }
}
