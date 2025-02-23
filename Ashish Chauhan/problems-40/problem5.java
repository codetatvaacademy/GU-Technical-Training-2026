// 5. WAP to take input days from the user and convert it into years, months, and remaining days.
import java.util.*;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        // Conversion logic
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int remainingDays = remainingDaysAfterYears % 30;

        // Displaying results
        System.out.println("Equivalent Time:");
        System.out.println(years + " Years, " + months + " Months, and " + remainingDays + " Days");

        sc.close(); // Closing scanner
    }
}
