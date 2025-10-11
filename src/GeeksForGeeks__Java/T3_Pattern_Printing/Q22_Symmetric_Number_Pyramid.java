package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q22_Symmetric_Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <= N - i ; k++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
