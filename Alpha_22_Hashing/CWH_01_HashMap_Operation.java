package Alpha_22_Hashing;

import java.util.HashMap;
import java.util.Set;

public class CWH_01_HashMap_Operation {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> hm = new HashMap<>();

        // Insertion Operation: O(1)
        System.out.println("Insert Operation");
        hm.put("India", 144);
        hm.put("china", 142);
        hm.put("japan", 20);
        hm.put("nepal", 6);
        hm.put("USA", 50);

        System.out.println(hm);


        // Get Operation: O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));


        // containsKey: O(1)
        System.out.println(hm.containsKey("USA"));
        System.out.println(hm.containsKey("Indonesia"));


        // Remove Operation: O(1)
        System.out.println(hm.remove("nepal"));
        System.out.println(hm);


        // Size Operation: 
        System.out.println(hm.size());


        // isEmpty: 
        System.out.println(hm.isEmpty());


        // clear:  (clear all data from HashMap)
        // hm.clear();
        System.out.println(hm.isEmpty());


        // Iteration over HashMap using Set: 
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key: " + k + ", Value: " + hm.get(k));
        }
    } 
} 