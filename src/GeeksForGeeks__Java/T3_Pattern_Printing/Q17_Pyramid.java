package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q17_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

//        for (int i = 1; i <= N; i++) {
//
//            for (int k = 1; k <= N - i; k++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= 2*i - 1; j++) {
//                System.out.print("# ");
//            }
//
//
//
//            System.out.println();
//        }


        int nsp = N - 1;
        int nst = 1;

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= nst; k++){
                System.out.print("* ");
            }

            nsp--;
            nst+=2;

            System.out.println();
        }


    }
}

