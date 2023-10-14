import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("total subject:");
        int TotalSub = sc.nextInt(); // Input: Total number of subjects
        System.out.println("enter all " + TotalSub + " subject marks:");
        int TotalSubject = ++TotalSub; // Increment the TotalSub by 1, not sure why

        int[] marks = new int[TotalSubject]; // Create an array to store subject marks

        // Input marks for each subject
        for (int i = 1; i < TotalSubject; i++) {
            System.out.println("subject " + i + ":");
            marks[i] = sc.nextInt(); // Input: Marks for the current subject
            sum += marks[i]; // Add the marks to the total sum
        }

        int averagePercenatage = 0;
        averagePercenatage = (sum / TotalSub); // Calculate the average percentage

        // Determine the grade based on the average percentage
        if (averagePercenatage > 95 && averagePercenatage < 101) {
            System.out.println("Grade: A++");
        } else if (averagePercenatage > 80 && averagePercenatage < 96) {
            System.out.println("Grade: B+");
        } else if (averagePercenatage > 60 && averagePercenatage < 81) {
            System.out.println("Grade: C");
        } else if (averagePercenatage > 45 && averagePercenatage < 61) {
            System.out.println("Grade: D");
        } else if (averagePercenatage > 34 && averagePercenatage < 46) {
            System.out.println("Pass");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("TOTAL MARKS : " + sum); // Display total marks
        System.out.println("AVERAGE PERCENTAGE : " + averagePercenatage); // Display average percentage
        sc.close(); // Close the scanner
    }
}
