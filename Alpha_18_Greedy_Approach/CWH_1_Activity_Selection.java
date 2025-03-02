package Alpha_18_Greedy_Approach;

import java.util.ArrayList;

public class CWH_1_Activity_Selection {
    public static void main(String[] args) {
        
        // Time complexity : O(n)   &   and Space complexity: O(n)
        int startTime[] = { 1, 3, 0, 5, 8, 5 };
        int endTime[] = { 2, 4, 6, 7, 9, 9 };      // Already sorted on the basis of end time.


        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity 
        maxActivity = 1;
        ans.add(0);                              // Always perform first activity
        int lastEndTime = endTime[0];

        for (int i = 1; i < endTime.length; i++) {
            if (startTime[i] >= lastEndTime) {
                // Activity Select 
                maxActivity++;
                ans.add(i);
                lastEndTime = endTime[i];
            }
        }

        System.out.println("Maximum Activities Perform: " + maxActivity);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Activity No. Perform: " + ans.get(i));
        }
    }
}