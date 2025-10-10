package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q8_Greatest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int A = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int B = sc.nextInt();

        System.out.print("Enter the Third Number : ");
        int C = sc.nextInt();

        if (A>=B && A>=C) {
            System.out.println(A + " is the greatest Number.");
        }

        else if (B>=A && B>=C) {
            System.out.println(B + " is the greatest Number.");
        }

        else {
            System.out.println(C + " is the greatest Number.");
        }

    }
}
