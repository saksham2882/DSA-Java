package Alpha_7_String;

public class CWH_7_Convert_Letters_to_Uppercase {
    
    // T.C : O(n)
    public static String Convert_to_uppercase(String str) {        
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            } 
        } 
        
        return sb.toString();
    }

    public static void main(String[] args) {
        
        // For a given String convert the first letter of each word to uppercase.
        
        String str = "hi, i am saksham agrahari";

        System.out.println("Converted String : " + Convert_to_uppercase(str));
        System.out.println("Converted String : " + Convert_to_uppercase("hello world s o p l i "));
    }
}
