import java.util.Scanner;
public class DaysToRemDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        sc.close();
        int years = days/365;
        days %= 365;
        int months = (int)(days/30.44);
        days%=30.44;
        System.out.println("Number of years: " + years);
        System.out.println("Number of months: " + months);
        System.out.println("Number of days: " + days);
    }
}