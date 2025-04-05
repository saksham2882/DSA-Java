package Alpha_02_Pattern;

import java.util.Scanner;

public class CWH_04_Inverted_Half_Pyramid_with_Number {

    // My code : 
    public static void Invert_Half_Pyra_Num(int row) {
        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= row; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }


    // Mam Code:
    public static void ManInverted(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();

        Invert_Half_Pyra_Num(row);
        ManInverted(row);
        sc.close();
    }
}
