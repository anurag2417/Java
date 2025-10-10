package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q10_Star_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Odd Number : ");
        int N = sc.nextInt();

        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=N; j++){
                if (i == N/2 + 1 || j == N/2 + 1) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
