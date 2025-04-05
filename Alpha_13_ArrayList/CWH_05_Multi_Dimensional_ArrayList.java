package Alpha_13_ArrayList;

import java.util.ArrayList;

public class CWH_05_Multi_Dimensional_ArrayList {
    public static void main(String[] args) {

        // Multi-dimensional ArrayList : (ArrayList of ArrayList)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>(); 
        list2.add(4);
        list2.add(6);
        
        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList); // output : [[1, 3], [4, 6]]

        // Example 1 : Print AOA Element :
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
