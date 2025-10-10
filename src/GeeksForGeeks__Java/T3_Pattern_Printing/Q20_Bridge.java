package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q20_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int l = 1; l <= 2*N+1; l++){
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 1; i <= N; i++){



            for (int j = 1; j <= N + 1 - i; j++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= 2*i - 1; k++){
                System.out.print("  ");
            }

            for (int j = 1; j <= N + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
