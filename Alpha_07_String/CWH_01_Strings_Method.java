package Alpha_07_String;

public class CWH_01_Strings_Method {
    public static void main(String[] args) {

        /*
         * Strings are Immutable.
         * Difference Between nextLine() and next():
         * nextLine() reads the entire line and returns it as a String.
         * next() reads the next token of the input as a String.
         */

        /*
         * charAt() method returns the character at the specified index in a string.
        */

        String name = "Saksham Agrahari";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        
        /*
         * SubString :
         * The substring() method returns a new string that is a substring of this string.
         * The substring() method has two versions:
         * 1. substring(int beginIndex)
         * 2. substring(int beginIndex, int endIndex)
         * 
         * The original string is not changed.
         * The substring() method returns an empty string if beginIndex is equal to endIndex.
         * The substring() method throws StringIndexOutOfBoundsException if beginIndex / endIndex is negative or greater than the length of this string, or endIndex is less than beginIndex.
         */
        
        String sub = name.substring(1, 5);   // 1 to 4
        System.out.println("Substring : " + sub);

    }
}