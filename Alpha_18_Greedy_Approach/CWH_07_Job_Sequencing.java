package Alpha_18_Greedy_Approach;

import java.util.ArrayList;
import java.util.Collections;

public class CWH_07_Job_Sequencing {

    static class Job {
        int deadline;
        int profit;
        int id;   // Id in number(indexes) like 0 -> represents (A) 

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };


        // Sorting of Object using Collections
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // sort jobs ArrayList in descending order of profit.
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); 
        

        // Main Operation 
        ArrayList<Integer> sequence = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                sequence.add(curr.id);
                time++;
            }
        }

        // Print Profit Sequence :
        System.out.println("max Job with max Profit: " + sequence.size());
        System.out.println("Sequence of Job(index): " + sequence);
    }
}
