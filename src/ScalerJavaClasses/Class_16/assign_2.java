package ScalerJavaClasses.Class_16;

import java.lang.*;
import java.util.*;

public class assign_2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = sc.nextInt();
        }
        int last = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }
}
