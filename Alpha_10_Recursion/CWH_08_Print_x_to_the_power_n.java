package Alpha_10_Recursion;

public class CWH_08_Print_x_to_the_power_n {

    // Brute Force : O(n)
    public static int power(int x, int n) {
        // Base case:
        if (n == 0) {
            return 1;
        }
        

        // Calculate :
        int xn1 = power(x, n - 1);
        int pow = x * xn1;
        return pow;
    }

    // Optimized : O(log n)
    public static int powerOptimized(int x, int n) {  
        // Base case:
        if (n == 0) {
            return 1;
        }
        // Calculate :
        int halfPower = powerOptimized(x, n / 2);           // here store the return value of recursive call to make complexity "log n"
        int halfPowerSq = halfPower * halfPower;

        // when n is odd :
        if (n % 2 != 0) {
            halfPowerSq =  x * halfPowerSq;
        }
        return halfPowerSq;
    }
                
    public static void main(String[] args) {

        int x = 2;
        int n = 10;

        System.out.println(x + " to the power " + n + " : " + power(x, n));
        System.out.println(x + " to the power " + n + " : " + powerOptimized(x, n));     
    }
}
