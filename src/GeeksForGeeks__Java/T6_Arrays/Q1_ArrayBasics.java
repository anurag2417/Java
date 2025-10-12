package GeeksForGeeks__Java.T6_Arrays;

public class Q1_ArrayBasics {
    public static void main(String[] args) {
        int[] x = {2, 8, 9, 16, 89, 25};        // First way of creating an array.

        // Access
        System.out.println(x[3]);

        // updating elements
        x[4] = 59;
        System.out.println(x[4]);


        int[] arr = new int[4];                 // Second way of creating an array

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr[0]);
    }
}
