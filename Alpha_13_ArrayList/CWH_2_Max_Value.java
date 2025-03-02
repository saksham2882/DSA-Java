package Alpha_13_ArrayList;
import java.util.ArrayList;

public class CWH_2_Max_Value {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element in the list :
        list.add(10);                        // O(1)
        list.add(31);
        list.add(12);
        list.add(3);
        list.add(1, 90);         // O(n)
        System.out.println(list); 
        
        // Example 3: Maximum Value in the ArrayList :    O(n)
        int max = Integer.MIN_VALUE;
        for (int k = 0; k < list.size(); k++) {
            // if (list.get(k) > max) {
            //     max = list.get(k);
            // }
            //     OR
            max = Math.max(max, list.get(k));
        }
        System.out.println("max element : " + max);
    }
}
