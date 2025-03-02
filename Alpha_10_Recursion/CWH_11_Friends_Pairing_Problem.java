package Alpha_10_Recursion;

public class CWH_11_Friends_Pairing_Problem {

    // Calculate total ways to pair or single in a party.

    public static int friends_Pairing(int n) {
        
        // Base case:
        if (n == 1 || n == 2) {
            return n;
        }

        // Choice for Pairing or stay single:
        // 1. Single :
        int fnm1 = friends_Pairing(n - 1);

        // 2. Paired :
        int fnm2 = friends_Pairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // Total Ways :
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }   
    
    public static void main(String[] args) {
        
        System.out.println(friends_Pairing(5));
    }
}
 