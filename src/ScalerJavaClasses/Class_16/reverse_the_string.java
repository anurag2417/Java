package ScalerJavaClasses.Class_16;

import java.util.*;
public class reverse_the_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = {1, 5, 6, 8, 9};



        for(int i=1; i<N-1; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = N-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

//static void reversePart(int[] arr, int s, int e) {
//
//}



//int  i = s;
//int j = e;
//while (i<j) {
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//    i++;
//    j--;
//}





//public static void main(String[] args) {
// int[] arr = {1, 2, 3, 4, 5, 6};
//
//reversePart(arr, 1,4);
//
//for (int i = 0; i<arr.length; i++){
//    System.out,print(arr[i] + i++);
//    }
//}

//static void reversePart(int[] arr, int i, int j,) {
//    while(i<j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] temp;
//
//        i++;
//        j--;
//    }
//}







// Rotate Array by 1

// int last = arr[arr.length-1];
// arr[3] = arr[2];
// arr[2] = arr[1];
// arr[1] = arr[0];
// arr[0] = last;

// last = arr[arr.length-1];
// for (int i = arr.length-2; i>0=; i--) {
//      arr[i+1] = arr[i];
//}
//arr[0] = last;







// Rotate Array by K;








// Transpose of a Matrix

// A[i][j] = A[j][i]
