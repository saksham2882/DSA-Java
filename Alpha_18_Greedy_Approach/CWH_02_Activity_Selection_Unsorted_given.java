package Alpha_18_Greedy_Approach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CWH_02_Activity_Selection_Unsorted_given {
    
    public static void main(String[] args) {
        
        // T.C : O(n log n) & S.C: O(n)
        int startTime[] = { 1, 3, 0, 5, 8, 5 };
        int endTime[] = { 2, 4, 6, 7, 9, 9 };         // suppose Not sorted

        // NOTE : sort_Act =>  sort activities on the basis of end Time in 2D-array
        // Sorting:
        int sort_Act[][] = new int[startTime.length][3];
        for (int i = 0; i < startTime.length; i++) {
            sort_Act[i][0] = i;                       // Index
            sort_Act[i][1] = startTime[i];            // Start Time
            sort_Act[i][2] = endTime[i];              // End Time
        }

        // Now sort the 2D-array on the basis of End Time : Using Comparator 
        Arrays.sort(sort_Act, Comparator.comparingDouble(o -> o[2]));
        
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity 
        maxActivity = 1;
        ans.add(sort_Act[0][0]);                      // Always do first activity
        int lastEndTime = sort_Act[0][2];

        for (int i = 1; i < endTime.length; i++) {
            if (sort_Act[i][1] >= lastEndTime) {
                // Activity Select 
                maxActivity++;
                ans.add(sort_Act[i][0]);
                lastEndTime = sort_Act[i][2];
            }
        }

        System.out.println("Maximum Activities Perform: " + maxActivity);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Activity No. Perform: " + ans.get(i));
        }
    }
}
