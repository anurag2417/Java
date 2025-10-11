package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q23_Diamond_like_Number_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(j + " ");
            }

            int constant  = N + 1 - i;
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print(constant + " ");
            }

            for (int j = N - i; j >= 1; j--) {

                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int i = 1; i <= (N - 1); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            int constant = i + 1;
            for (int j = 1; j <= 2*(N - i) - 1 ; j++) {
                System.out.print(constant + " ");
            }

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
