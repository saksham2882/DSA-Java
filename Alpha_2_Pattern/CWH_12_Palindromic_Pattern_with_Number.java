package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_12_Palindromic_Pattern_with_Number {

    public static void Palindrome_Pattern(int row) {
        for (int i = 1; i <= row; i++) {
            // Space :
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            // Number in decreasing order :
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            // Number in Increasing Order:
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();

        Palindrome_Pattern(row);

        sc.close();
    }
}
