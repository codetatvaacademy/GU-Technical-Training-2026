import java.util.Scanner;

public class Problem05 {
    public static void conversion(int totalDays) {
        int years = totalDays / 365;
        totalDays = totalDays % 365;
        int months = totalDays / 30;
        int remainingDays = totalDays % 30;

        System.out.println(totalDays + " days is equivalent to " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        
        conversion(totalDays);       
    }
    
}
