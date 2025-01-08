package Atishay_Jain;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int alphabetCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isAlphabetic(ch)) {
                alphabetCount++;
            }
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
            else {
                specialCount++;
            }
        }

        System.out.println("Number of Alphabets: " + alphabetCount);
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Number of Special Characters: " + specialCount);

    }
}


