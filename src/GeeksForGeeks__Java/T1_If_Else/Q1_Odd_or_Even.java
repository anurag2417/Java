package GeeksForGeeks__Java.T1_If_Else;
import java.util.*;

public class Q1_Odd_or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int N = sc.nextInt();

        if (N<0) {
            N = -N;
        }

        else if (N%2==0) {
            System.out.println(N + " is an Even Number");
        }

        else {
            System.out.println(N + " is a Odd Number");
        }
    }
}
