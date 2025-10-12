package GeeksForGeeks__Java.T6_Arrays;

import java.util.Scanner;

public class Q16_Reverse_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
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

        int A = 0;
        int B = N-1;

        while (A <= B){
            int temp = arr[A];
            arr[A] = arr[B];
            arr[B] = temp;
            A++;
            B--;
        }

        System.out.print("Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
