package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q12_Factorial_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }

        System.out.print("Factorial of " + N + " = " + fact);

    }
}
