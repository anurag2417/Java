package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q9_Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        while (N>0){
            int r = N%10;
            System.out.println(r);
            N = N/10;
        }
    }
}
