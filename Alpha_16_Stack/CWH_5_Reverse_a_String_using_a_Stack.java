package Alpha_16_Stack;
import java.util.Stack;

public class CWH_5_Reverse_a_String_using_a_Stack {

    // T.C : O(n)
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;

        // Pushing String Character 
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        //Popping and append in result
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        // convert to String from StringBuilder
        return result.toString();
    }

    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println("Original String: " + str);

        String reverse = reverseString(str);
        System.out.println("Reversed String: " + reverse);
    }
}
