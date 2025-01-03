import java.util.*;
public class YearMonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();
        int year = totalDays/365;
        int remaningDays = totalDays % 365;
        int month = remaningDays/30;
        int days = remaningDays%30;
        System.out.println(year+" year ,"+month+" month ,"+days+" days");
    }
}
