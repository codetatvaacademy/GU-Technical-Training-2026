//WAP to take input days from the user and convert it into years, months, and remaining days.

import java.util.Scanner;

class convertDays {
    public static void convertion(int totalDays){
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        remainingDays %= 30;
        System.out.println(totalDays + " days" + " = " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        convertion(totalDays);
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)