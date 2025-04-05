package Alpha_22_Hashing;

import java.util.*;

public class CWH_07_LinkedHashSet_and_TreeSet {
    public static void main(String[] args) {

        // HashSet :
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // LinkedHashSet :
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        // TreeSet :
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println("HashSet: " + cities);
        System.out.println("LinkedHashSet: " + lhs);
        System.out.println("TreeSet: " + ts);
    }
}
