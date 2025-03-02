package Alpha_3_Function_and_method;

import java.util.Scanner;

public class CWH_4_Prime_no_Range {

    public static boolean IsPrime(int num) {

        boolean isPrime = false;

        if (num == 1 || num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                return false;
            } else {
                return true;
            }
        }
    }

    // Prime Number Range :
    public static void PrimeRange(int num) {

        if (num <= 0) {
            System.out.println("Enter a positive Number.");
        } else {
            for (int i = 2; i < num; i++) {
                if (IsPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range for (2 to Range) : ");
        int r = sc.nextInt();
        
        PrimeRange(r);

        sc.close();
    }
}
