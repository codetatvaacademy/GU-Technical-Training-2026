import java.util.*;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays/365;
        int remainingDaysAfterYears = totalDays%365;
        int months = remainingDaysAfterYears/30;
        int remainingDays = remainingDaysAfterYears%30;

        System.out.println("Equivalent time: " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }
}
