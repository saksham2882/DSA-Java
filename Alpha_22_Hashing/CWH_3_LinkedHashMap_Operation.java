package Alpha_22_Hashing;

import java.util.*;

public class CWH_3_LinkedHashMap_Operation {
    
    public static void main(String[] args) {
        
        // LinkedHashMap -> Insertion Ordered maintained
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);
        lhm.put("UAE", 10);

        // HashMap -> Insertion Ordered does not maintained
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("UAE", 10);

        // TreeMap -> keys sorted in ascending Order
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("USA", 50);
        tm.put("UAE", 10);

        System.out.print("\nLinkedHashMap -> ");
        System.out.println(lhm);
        System.out.print("HashMap -> ");
        System.out.println(hm);
        System.out.print("TreeMap -> ");
        System.out.println(tm);
    }
}
