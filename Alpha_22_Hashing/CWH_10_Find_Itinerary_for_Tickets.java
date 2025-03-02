package Alpha_22_Hashing;

import java.util.HashMap;

public class CWH_10_Find_Itinerary_for_Tickets {

    public static String getStartPoint(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);      // to - from
        }
        
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;                        // Starting point
            }
        }
        
        return null;                               // assume otherwise always start point exist.
    }
    
    public static void main(String[] args) {       // O(n)
         
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", "Goa");

        String start = getStartPoint(tickets);

        System.out.print(start);
        for (@SuppressWarnings("unused") String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();
    }
}
