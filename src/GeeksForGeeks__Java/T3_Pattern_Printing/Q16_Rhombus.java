package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q16_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
//            for (int j = 1; j <= N - i; j++){
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            for (int k = 1; k <= N - i; k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();


            for (int j = 1; j <= N - i; j++){
                 System.out.print("  ");
            }


            for (int l = 1; l <= N; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
