package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q13_a_raised_to_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int A = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int B = sc.nextInt();

        int power = 1;

        for (int i = 1; i <=B; i++) {
            power = power * A;
        }

        System.out.println(A + " to the power " + B + " = " + power);

    }
}
