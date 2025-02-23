import java.util.Scanner;
public class DaysConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int totalDays = sc.nextInt();
        int years = totalDays / 365;
        int remDaysYears = totalDays % 365;
        int months = remDaysYears / 30;
        int remainingDays = remDaysYears % 30;

        // Displaying result
        System.out.println("Equivalent time: " + years + " years, " + months + " months, and " + remainingDays + " days.");

    }
}
