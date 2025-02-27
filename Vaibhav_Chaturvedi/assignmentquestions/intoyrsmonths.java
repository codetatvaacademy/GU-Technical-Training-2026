

import java.util.Scanner;
import java.util.*;

class intoyrsmonths{
    public static void main(String[] args) {
        System.out.println("enter number of days");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int years =  days/365;
        int remaindays = days%365;
        int months = remaindays/30;
        int realremaindays = remaindays%30;
        System.out.println("years"+years);
        System.out.println("months"+years);
        System.out.println("remaining days "+realremaindays);

    }
}