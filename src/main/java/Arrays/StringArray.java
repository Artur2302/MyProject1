package Arrays;

import java.util.Scanner;

public class StringArray {
    private static String str;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        str = input.next();
        System.out.println("The count of words in string: " + str.length());
        System.out.println("Words in string: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
