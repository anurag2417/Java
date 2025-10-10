package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q15_Vertically_flipped_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for(int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
