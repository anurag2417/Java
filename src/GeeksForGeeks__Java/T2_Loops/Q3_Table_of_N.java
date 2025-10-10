package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q3_Table_of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Req. Table Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " X " + i + " = " + (N*i));
        }
    }
}
