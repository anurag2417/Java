package GeeksForGeeks__Java.T6_Arrays;

import java.util.Scanner;

public class Q11_Multipy_odd_indexed_by_2_and_add_10_to_even_indexed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println();

        System.out.println("Enter the Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1 ; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();

        System.out.print("Modified Array : ");

        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 0) {
                int add = arr[i] + 10;
                System.out.print(add + " ");
            }

            else {
                int multiply = arr[i]*2;
                System.out.print(multiply + " ");
            }
        }
    }
}
