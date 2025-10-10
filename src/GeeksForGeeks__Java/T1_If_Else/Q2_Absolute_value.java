package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q2_Absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

//        one line code

        if (N<0) {
            N = -N;
        }
        System.out.println("Absolute Number = " + N);

//        if (N>=0) {
//            System.out.println("Absolute value = " + N);
//        }
//
//        else {
//            System.out.println("Absolute value = " + -N);
//        }

    }
}
