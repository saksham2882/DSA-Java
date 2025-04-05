package Alpha_12_Backtracking;

public class CWH_03_Find_Permutations {

    // Find all the Permutation of the String:
    public static void findPermutation(String str, String answer) {
        // Base case:
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }

        // recursion : O(n * n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(NewStr, answer + curr);
        }
    }

    public static void main(String[] args) {
        
        String str = "abc";
        findPermutation(str, "");
    }
} 