package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q8_Compositive_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(N + " is neither Prime not Composite");
        }

        int count = 0;

        for (int i = 1; i <=N; i++) {
            if (N%i == 0) {
                count++;
            }
        }

        if (count==2){
            System.out.println(N + " is a Prime Number");
        }


        else {
            System.out.println(N + " is a Composite Number");
        }
    }
}
