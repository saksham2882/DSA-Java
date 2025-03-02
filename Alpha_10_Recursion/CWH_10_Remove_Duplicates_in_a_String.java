package Alpha_10_Recursion;

public class CWH_10_Remove_Duplicates_in_a_String {
    
    // Remove Duplicates character from the String: 
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean track[]) {
        
        // Base Case :
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if (track[currChar-'a'] == true) {
            //Duplicate exists :
            removeDuplicates(str, index + 1, newStr, track);
        }
        else {
            track[currChar-'a'] = true;
            removeDuplicates(str, index + 1, newStr.append(currChar), track);
        }
    }
    
    public static void main(String[] args) {
        
        String str = "appnnacollege";     // (Assuming all character are in small letter)

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
