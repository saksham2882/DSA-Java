package Alpha_7_String;

public class CWH_4_String_Comparsion {
    
    public static void main(String[] args) {
        
        /*
         * compareTo():
         * 1. The compareTo() method compares two strings lexicographically.
         * 2. The method returns 0 if the strings are equal, a value less than 0 if this
         * String occurs before the argument in lexicographic order, and a value greater
         * than 0 if this String occurs after the argument in lexicographic order.
         * 3. The method compares two strings lexicographically using the rules of
         * Unicode values.
         * s1 > s2 :- +ve value
         * s1 == s2 :- 0
         * s1 < s2 :- -ve value
         */

        // Always use "compareTo()" instead of "==" because in some cases "==" gives wrong answer.
        // Example:

        String s1 = "Saksham";
        String s2 = "Saksham";


        System.out.print("Comparing using ( compareTo() ) : ");
        if (s1.compareTo(s2) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }


        // Case 1: (it give correct answer)
        System.out.print("Comparing using (==) give Wrong Answer : ");
        if (s1 == s2) {          // It only check is equal in Object level or not.
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal.");
        }


        // Case 2: (it give wrong answer)
        System.out.print("Comparing using (creating two new same string && ==) gives correct answer : ");
        
        if (new String("Agrahari") == new String("Agrahari")) { 
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal.");
        }

    }
}
