package GeeksForGeeks__Java.T5_Strings;

import java.util.*;

public class Q5_Count_UpperCase_and_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        int lowerCount = 0;
        int upperCount = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                lowerCount++;
            }

            else if (Character.isUpperCase(str.charAt(i))) {
                upperCount++;
            }
        }

        System.out.print("No. of Upper Case in the String : ");
        System.out.println(upperCount);

        System.out.print("No. of Lower Case in the String : ");
        System.out.println(lowerCount);
    }
}
