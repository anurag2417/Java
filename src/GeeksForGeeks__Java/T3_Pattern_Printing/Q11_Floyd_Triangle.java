package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q11_Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        int A = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j<=i; j++){
                System.out.print(A + " ");
                A++;
            }

            System.out.println();
        }
    }
}
