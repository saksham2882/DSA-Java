package Alpha_12_Backtracking;

public class CWH_2_Find_Subsets {
    public static void findSubsets(String str, String answer, int index) {
        // Base Case:
        if (index == str.length()) {
            if (answer.length() == 0) {
                System.out.println("Empty");
            } else {
                System.out.println(answer); 
            }
            return;
        }

        // Recursion :
        // Yes choice : means be a part of string
        findSubsets(str, answer + str.charAt(index), index + 1);

        // No : means Not be a part of String
        findSubsets(str, answer, index + 1);
    }

    public static void main(String[] args) {

        // Find and print all subsets of a given string "abc".
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
