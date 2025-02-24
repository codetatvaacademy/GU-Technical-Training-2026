package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class convertDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        remainingDays %= 30;
        System.out.println(totalDays + " = " + years + " years, " + months + " months, and " + remainingDays + " days.");
        sc.close();
    }
}
