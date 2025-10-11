package GeeksForGeeks__Java.T5_Strings;

import java.util.*;

public class Q2_Number_of_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        String vowels = "aeiou";

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
