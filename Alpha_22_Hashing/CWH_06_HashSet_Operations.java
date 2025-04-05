package Alpha_22_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class CWH_06_HashSet_Operations {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(6);

        System.out.println(set);

        set.remove(2);

        if (set.contains(2)) {
            System.out.println("Set Contains 2 ");
        } else {
            System.out.println(set.contains(2));
        }


        // Iterator :
        @SuppressWarnings("rawtypes")
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Advance for-each loop:
        for (Integer s : set) {
            System.out.println(s);
        }
    }
}