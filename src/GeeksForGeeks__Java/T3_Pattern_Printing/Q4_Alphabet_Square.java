package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q4_Alphabet_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Rows & Columns : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
