package GeeksForGeeks__Java.T4_Methods;

import java.util.*;

public class Q5_Permutation_and_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();

        System.out.print("Enter the value of R : ");
        int R = sc.nextInt();

        int ncr = fact(N)/(fact(R)*fact(N - R));

        System.out.print("C("+N+", "+R+") = ");
        System.out.println(ncr);

        int npr = fact(N)/fact(N-R);
        System.out.print("P("+N+", "+R+") = ");
        System.out.println(npr);

    }

    public static int fact(int x) {

        int prod = 1;

        for (int i = 1; i <= x; i++){
            prod = prod * i;
        }
        return prod;
    }
}
