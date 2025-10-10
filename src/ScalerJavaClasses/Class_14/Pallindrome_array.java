package ScalerJavaClasses.Class_14;


public class Pallindrome_array {
    public static void main(String[] args) {
//        int[] marks = new int[5];
//
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 50;
//
//        int i = 0;
//        int j = marks.length-1;
//        while (i<j) {
//            int temp = marks[i];
//            marks[i] = marks[j];
//            marks[j] = temp;
//            i++;
//            j--;
//        }
//
        int[] arr = {1,2,3,2,1};
        int [] na = new int[arr.length];
        int j = arr.length-1, i=0;
        while (j>=0) {
            na[i] = arr[j];
        }

        int aban = 1;
        int k=0;
        while (k < arr.length) {
            if (arr[k] != na[k]) {
                System.out.println("Not a Palindrome");
                aban = 2;
                break;
            }

            k++;

            if (aban == 1) {
                System.out.println("Palindrome");
            }
        }

    }
}