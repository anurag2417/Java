package GeeksForGeeks__Java.T6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_Shallow_Copy_and_Deep_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 4;                          // 4 bytes leta hai ye
        int[] arr = {10, 20, 30, 40};       // 16 byte

        int[] x = arr;              // s is shallow copy of arr
        x[0] = 100;

        int[] y = Arrays.copyOf(arr, arr.length);       //deep copy
        y[0] = 100;

        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
