//WAP to take input days from the user and convert it into years, months, and remaining days.//
import java.util.Scanner;
public class DaysIntoYearAndMonths{
    public static String days(int d){
        int daysInYear = 365;
        int daysInMonth = 30;
        int years = d / daysInYear;
        int remainingDays = d % daysInYear;
        int months = remainingDays / daysInMonth;
        remainingDays = remainingDays % daysInMonth;
        return years + " years, " + months + " months, and " + remainingDays + " days";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of days:");
        int d = sc.nextInt();
        System.out.println("the no. of years in these days is:" + days(d));
    }
}
