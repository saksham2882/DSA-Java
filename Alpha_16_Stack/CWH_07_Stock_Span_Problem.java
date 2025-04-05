package Alpha_16_Stack;
import java.util.Stack;

public class CWH_07_Stock_Span_Problem {

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;         // 1st day span is always "1" (itself)
        s.push(0);      // index of stock
        
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {    // Check in stack and remove smaller and equal prices
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i+1;                                         // last Element when stack is empty 
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            
            s.push(i);
        }
    }

    public static void main(String[] args) {
        // Price of the Stock are given for a particular day in a week. We have to find Span.
        // Span => Maximum number of consecutive days for which "Stock Price <= Today's Price".

        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}