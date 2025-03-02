package Alpha_10_Recursion;

public class CWH_4_Print_Nth_Fibonacci_number {

    // T.C : // O(2^n)
    public static int Nth_Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = Nth_Fibonacci(n - 1);
        int fib2 = Nth_Fibonacci(n - 2);
        int result = fib1 + fib2;
        return result;
    }
    public static void main(String[] args) {
        
        int n = 5;
        System.out.println(n + "th Fibonacci : " + Nth_Fibonacci(n));
    }
}
