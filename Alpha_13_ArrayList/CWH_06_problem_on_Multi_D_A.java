package Alpha_13_ArrayList;

import java.util.ArrayList;

public class CWH_06_problem_on_Multi_D_A {
    public static void main(String[] args) {
        
         // Multi-dimensional ArrayList : (ArrayList of ArrayList)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Problem 1 :  Create a AOA that store a multiple of 2, 3, 5. 
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list2.add(2 * i);
            list3.add(3 * i);
            list5.add(5 * i);
        }
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list5);
        System.out.println(mainList);
        list3.remove(2);
        list3.remove(3);

        // Printing Elements :
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                System.out.print( mainList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}