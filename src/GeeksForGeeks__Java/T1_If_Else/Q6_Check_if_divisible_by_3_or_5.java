package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q6_Check_if_divisible_by_3_or_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        if (N%15==0){
            System.out.println(N + " is divisible by both 3 and 5.");
        }

        else if (N%3==0) {
            System.out.println(N + " is divisible by 3.");
        }

        else if (N%5==0) {
            System.out.println(N + " is divisible by 5.");
        }

        else {
            System.out.println(N + " is not divisible by 3 or 5");
        }
    }
}
