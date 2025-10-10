package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q19_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        int nsp = N - 1;
        int nst = 1;

        for (int i = 1; i <= N; i++){
            for (int k = 1; k <= nsp; k++){
                System.out.print("  ");
            }

            for (int j = 1; j <= nst; j++){
                System.out.print("* ");
            }

            nsp--;
            nst+=2;

            System.out.println();
        }

        nsp = 1;
        nst = 2*N - 3;

        for (int i = 1; i <= N-1; i++){
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
