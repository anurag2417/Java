package GeeksForGeeks__Java.T6_Arrays;

import java.util.*;

public class Q18_Segregate_0s_and_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int N = sc.nextInt();

        System.out.println();

        int[] arr = new int[N];

        System.out.println("Enter the Elements of the Array : ");

        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Elements of the Array : ");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


    }
}
