package GeeksForGeeks__Java.T6_Arrays;

public class Q15_For_Each_Loop {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 6, 4};

        for (int ele : arr) {                   // we can not change element using for-each loop.
            System.out.print(ele + "  ");       // it is only used for displaying the elements of given array.
        }
    }
}
