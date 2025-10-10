package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q21_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= 2*N - 1; i++){

            for (int j = 1; j <= 2*N-1; j++){
                int A = i;
                int B = j;

                if (i>N) {
                    A = 2*N - i;
                }
                if (j>N){
                    B = 2*N - j;
                }
                System.out.print(Math.min(A,B) + " ");
            }

            System.out.println();
        }
    }
}
