package Alpha_16_Stack;
import java.util.Stack;

public class CWH_10_Duplicate_Parentheses {

    public static boolean isDuplicate_Parentheses(String str) {    // O (n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing:
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    System.out.println("Duplicate Parentheses is exists.");
                    return true;      // duplicate parentheses is exists
                }
            }
            // Opening:
            else {
                s.push(ch);
            }
        }

        System.out.println("Duplicate Parentheses is not exists.");
        return false;
    }

    public static void main(String[] args) {
        
        // Assume a valid String is given (balanced parentheses):
        String str = "((a + b) + (c + d))";
        String str_1 = "((a + b))";

        // System.out.println(isDuplicate_Parentheses(str));
        // System.out.println(isDuplicate_Parentheses(str_1));

        isDuplicate_Parentheses(str);
        isDuplicate_Parentheses(str_1);
    }
}
