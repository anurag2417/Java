package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q3_Is_integer_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        double X = sc.nextDouble();

        double N = (int)X;

        if (X-N > 0) {
            System.out.println(X + " is not an Integer");
        }

        else {
            System.out.println(X + " is an Integer");
        }

    }
}
