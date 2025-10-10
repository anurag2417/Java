package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q14_Vertically_Flipped_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

//        for (int i = 1; i <= N; i++){
//            for(int j = 1; j <= N; j++) {
//                if (i+j<=N){
//                    System.out.print("  ");
//                }
//
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//
//        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

//        for (int i = 1; i <= N; i++) {
//            for (int k = 1; k <= i - 1; k++){
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= N + 1 - i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
    }
}
