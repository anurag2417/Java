package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q5_4_Digit_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        if (N>1000 && N<=9999) {
            System.out.println(N + " is a 4 - digit Number");
        }

        else {
            System.out.println(N + " is not a 4 - digit Number");
        }


    }
}
