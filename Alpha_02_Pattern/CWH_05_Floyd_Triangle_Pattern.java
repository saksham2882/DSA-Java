package Alpha_02_Pattern;

import java.util.Scanner;

public class CWH_05_Floyd_Triangle_Pattern {

    public static void Floyd_Triangle(int row) {
        int n = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows: ");
        int row = sc.nextInt();

        Floyd_Triangle(row);

        sc.close();
    }
}
