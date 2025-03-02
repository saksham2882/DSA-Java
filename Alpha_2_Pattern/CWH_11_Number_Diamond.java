package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_11_Number_Diamond {

    public static void Number_Diamond(int row) {

        for (int i = 1; i <= row; i++) {
            // Space :
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Number :
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of rows: ");
        int row = sc.nextInt();

        Number_Diamond(row);

        sc.close();
    }
}
