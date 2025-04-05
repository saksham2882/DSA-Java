package Alpha_18_Greedy_Approach;

import java.util.Arrays;
import java.util.Collections;

public class CWH_08_Chocola_Problem {
    public static void main(String[] args) {

        // NOTE: This problem is in SPOJ platform.
        
        // int row = 4, column = 6;
        Integer vertical_Cost[] = { 2, 1, 3, 1, 4 };            // column - 1;
        Integer horizontal_Cost[] = { 4, 1, 2 };                // row - 1;

        // Step 1: sort cost in decreasing order.
        Arrays.sort(vertical_Cost, Collections.reverseOrder());
        Arrays.sort(horizontal_Cost, Collections.reverseOrder());

        // Step 2:
        int h = 0, v = 0;           // two pointer which track array element (tell about which cut we apply -> which array[h or v] is greater)
        int hp = 1, vp = 1;         // hp -> horizontal piece and vp -> vertical piece. Initially only single big piece of chocolate, so both are 1.
        int cost = 0;

        while (h < horizontal_Cost.length && v < vertical_Cost.length) {
            // because we apply expensive cut first
            if (vertical_Cost[v] <= horizontal_Cost[h]) {       // horizontal cut 
                cost += (horizontal_Cost[h] * vp);
                hp++;
                h++;
            } else {
                cost += (vertical_Cost[v] * hp);                // vertical cut
                vp++;
                v++;
            }
        }
        

        // cut when only rows (horizontal cost) is left:
        while (h < horizontal_Cost.length) {
            cost += (horizontal_Cost[h] * vp);
            hp++;
            h++;
        }

        // cut when only column (vertical cost) is left:
        while (v < vertical_Cost.length) {
            cost += (vertical_Cost[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts: " + cost);
    }
}