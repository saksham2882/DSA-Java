package Alpha_13_ArrayList;
import java.util.ArrayList;

public class CWH_3_Swap_Two_Number {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // Add Element in the list :
        list.add(10);                   // O(1)
        list.add(31);
        list.add(12);
        list.add(3);
        list.add(1, 90);    // O(n) 
        System.out.println(list);  

        // Problem 1: Swap two numbers at given index. let swap "90" at index 1 with "12" at index 3.
        int index1 = 1, index2 = 3;
        swap(list, index1, index2);
        System.out.println(list);   
    }
}
