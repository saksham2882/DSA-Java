package Alpha_07_String;

public class CWH_05_Print_Largest_String {

    // Time Complexity : O(x + n)
    // where x = length of largest string , n = no. of string.
    public static String Largest_String(String[] str) {
        String largest = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].compareToIgnoreCase(largest) > 0) {
                largest = str[i];
            }
        }
        return largest; 
    }
    
    public static void main(String[] args) {
        
        String[] str = { "apple", "banana", "mango", "Orange", "Grapes" };

        System.out.println("Largest String : " + Largest_String(str));
    }
}
