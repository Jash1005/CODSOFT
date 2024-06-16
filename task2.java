/*
 * Grading policy
 * A+ = 95-100
 * A = 90-95
 * B = 80-90
 * C = 65-80
 * D = 40 - 65
 * E = 33 - 40
 * F = <33 
 */

import java.util.*;

public class task2 {

    public static String check(long average_percentage) {
        String s = null;
        int avg_percentage = (int) average_percentage;

        if (avg_percentage >= 95)
            s = "A+";
        else if (avg_percentage >= 90 && avg_percentage < 95)
            s = "A";
        else if (avg_percentage >= 80 && avg_percentage < 90)
            s = "B";
        else if (avg_percentage >= 65 && avg_percentage < 80)
            s = "C";
        else if (avg_percentage >= 40 && avg_percentage < 65)
            s = "D";
        else if (avg_percentage >= 33 && avg_percentage < 40)
            s = "E";

        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total number of subject");
        int total_sub = sc.nextInt();
        int[] arr = new int[total_sub];

        System.out.println("Enter marks obtained out of 100 in each subject.");
        int sum = 0;

        for (int i = 0; i < total_sub; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        long avg_percentage = sum / total_sub;

        String s = check(avg_percentage);

        System.out.println("Total marks obtained: " + sum);
        System.out.println("Average Percentage: " + avg_percentage);
        System.out.println("Grade: " + s);
    }
}
