package Alpha_03_Function_and_method;

public class CWH_03_Check_prime_or_Not {

    // Check Prime or not:
    public static void IsPrime(int num) {

        boolean isPrime = false;

        if (num <= 0) {
            System.out.println("Enter Positive Value.");
        } 
        else if (num == 1 || num == 2) {
            System.out.println(num + " is a Prime.");
        } 
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is not a Prime.");
            } else {
                System.out.println(num + " is a Prime.");
            }
        }
    }

    public static void main(String[] args) {
        
        IsPrime(-1);
        IsPrime(0);
        IsPrime(1);
        IsPrime(10);
        IsPrime(2);
        IsPrime(4);
        IsPrime(17);
    }
}
