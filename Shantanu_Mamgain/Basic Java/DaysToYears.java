import java.util.*;

public class DaysToYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int inputDays= sc.nextInt();

        int years = inputDays/365;
        int remainingDaysAfterYears = inputDays%365;

        int months = remainingDaysAfterYears /30;
        int remainingDays = remainingDaysAfterYears%30;

        
        
        System.out.println("Years: "+ years);
        System.out.println("Months: "+ months);
        System.out.println("remaining days: "+ remainingDays);
        sc.close();
    }
}
