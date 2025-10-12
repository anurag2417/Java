package GeeksForGeeks__Java.T6_Arrays;

import java.util.*;

public class Q9_Passing_Array_to_Menthods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = {11, 22, 33, 44, 58, 66, 77, 88};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] x) {
        x[2] = 55;
    }
}
