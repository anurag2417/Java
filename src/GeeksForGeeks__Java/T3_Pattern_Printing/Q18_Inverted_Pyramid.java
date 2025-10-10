package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q18_Inverted_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        int nsp = 0;
        int nst = 2*N - 1;

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }

            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }

            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
