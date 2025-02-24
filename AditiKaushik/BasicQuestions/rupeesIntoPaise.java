package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class rupeesIntoPaise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees: ");
        int rupees = sc.nextInt();
        System.out.println("Amount in Paise: " + rupees*100);
        sc.close();
    }
}