package GeeksForGeeks__Java.T6_Arrays;

import java.util.Scanner;

public class Q8_Array_of_Other_Data_Types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the Array : ");
        int N = sc.nextInt();

        char[] ch = new char[N];

        for (int i = 0; i <= ch.length - 1; i++) {
            System.out.print(ch[i] + " ");
        }

        String[] arr = {"Abhinav", "Harsh", "Anurag", "Sahil", "Ishika"};
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
