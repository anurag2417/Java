package GeeksForGeeks__Java.T4_Methods;

import java.util.*;

public class Q6_Swap_two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number A : ");
        int A = sc.nextInt();

        System.out.print("Enter the Number B : ");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;


        System.out.println("After Swapping both the Numbers");
        System.out.println("Value of Number A : " + A);
        System.out.println("Value of Number B : " + B);
    }
}
