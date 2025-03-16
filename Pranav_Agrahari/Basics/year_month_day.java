import java.util.Scanner;

public class year_month_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int year = days/365;
        int months = (days-(365*year))/30;
        int day = (days-(365*year))-(30*months);
        System.out.println(year);
        System.out.println(months);
        System.out.println(day);
    }
}
