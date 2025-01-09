
import java.util.Scanner;
public class calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days =sc.nextInt();
        int years=days/365;
    int remaining_days = days%365;
      int months = remaining_days/30;
      int remaining_days2 = remaining_days%30;
System.out.println("years = " + years + " , months = "+ months + ", remainings_days2 = " + remaining_days2);

    }
}