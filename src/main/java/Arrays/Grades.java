package Arrays;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(StringArray[] args) {
        System.out.println("How many grades would you like to enter");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " +  calculateHighest());
        System.out.println("Lowest: " + calculateLowest());


    }

    private static void getGrades() {
        for (int i = 0; i < grades.length ; i++) {
            System.out.println("Enter grade " + (i+1));
            grades[i] = scanner.nextInt();
        }
    }
    public static int calculateSum(){
        int sum = 0;
        for (int grade : grades) {
                sum += grade;

        }

        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/ grades.length;
    }

    public static int calculateHighest(){
        int highest = grades[0];
        for (int grade : grades) {
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int calculateLowest(){
        int lowest = grades[0];
        for (int grade : grades) {
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
