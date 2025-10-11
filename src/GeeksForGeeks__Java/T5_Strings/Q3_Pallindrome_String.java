package GeeksForGeeks__Java.T5_Strings;

import java.util.*;

public class Q3_Pallindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }

            else {
                i++;
                j--;
            }

        }

        if (isPalindrome) {
            System.out.println("It a Palindrome String");
        }
        else {
            System.out.println("It is not a Palindrome String");
        }

    }
}
