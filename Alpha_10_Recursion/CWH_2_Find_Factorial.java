package Alpha_10_Recursion;

public class CWH_2_Find_Factorial {
    // Find Factorial : O(n) both time and space.
    // O(n) : Space complexity because in call stack every single level create "a new" variable. So in worst case "n" variable created.
    public static int findFact(int n) {
        if (n == 0) {
            return 1; 
        }
        int result = n * findFact(n - 1);
        return result;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(findFact(n));
    }
}
