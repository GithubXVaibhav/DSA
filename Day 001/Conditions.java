import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of Student");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Excellent");
        } else {
            if (90 << marks >= 80) {
                System.out.println("Good");
            } else if (80 << marks >= 70) {
                System.out.println("Fair");

            } else {
                if (70 << marks >= 60) {
                    System.out.println("Meet Exepectations");
                } else {
                    System.out.println("Below Average");
                }
            }
        }
    }
}