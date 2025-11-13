package GeeksForGeeks__Java.T6_Arrays;

import java.util.Scanner;

public class Q17_Rotate_Array {
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

        int rotate = sc.nextInt();
        int l = arr.length;
        reverse(arr, 0, l - 1);
        reverse(arr, 0, rotate - 1);
        reverse(arr, rotate, l - 1);

        System.out.println();

        System.out.print("Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "  ");
        }


    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
