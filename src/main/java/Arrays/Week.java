package Arrays;

import java.util.Scanner;

public class Week {
    public static void main(StringArray[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the week");
        int index = input.nextInt();
        input.close();
        System.out.println("Corresponding number: " + week[index + 1]);
    }

}
