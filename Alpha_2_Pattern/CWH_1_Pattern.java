package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_1_Pattern {
    public static void main(String[] args) {

        // Example 1:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        // Example 2:
        System.out.println("Inverted Star Pattern :");
        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        // Example 3:
        System.out.println("Print HALF-PYRAMID pattern :");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }


        // Example 4:
        System.out.println("Print CHARACTER Pattern : ");
        char ch = 'A';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + "  ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
