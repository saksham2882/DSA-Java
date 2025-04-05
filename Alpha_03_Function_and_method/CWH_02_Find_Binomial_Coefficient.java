package Alpha_03_Function_and_method;

import java.util.Scanner;

public class CWH_02_Find_Binomial_Coefficient {

    // Find Factorial :
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    // Find Binomial Coefficient : 
    public static void BinoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial((n - r));

        int bin = fact_n / (fact_r * fact_nmr);
        System.out.println(bin);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        
        BinoCoeff(n, r);

        sc.close();
    }
}
