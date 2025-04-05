package Alpha_16_Stack;

import java.util.Stack;

public class CWH_03_Stack_using_Java_Collections_Framework {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        System.out.println("Push -> " + s.push(1));
        System.out.println("Push -> " + s.push(2));
        System.out.println("Push -> " + s.push(3));
        System.out.println("Push -> " + s.push(4));

        System.out.println("Topmost Element of Stack: " + s.peek());

        while (!s.isEmpty()) {
            System.out.println("Popped Element: " + s.pop());
        }
        
        System.out.println("Topmost Element of Stack: " + s.peek());
    }
}
