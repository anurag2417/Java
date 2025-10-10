package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q12_Binary_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
