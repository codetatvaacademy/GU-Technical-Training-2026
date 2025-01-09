//wap to take 3 inputs and print second largest of them

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        
        int secondLargest;

        if ((number1 > number2 && number1 < number3) || (number1 > number3 && number1 < number2)) {
            secondLargest = number1;
        } else if ((number2 > number1 && number2 < number3) || (number2 > number3 && number2 < number1)) {
            secondLargest = number2;
        } else {
            secondLargest = number3;
        }

        System.out.println("Second largest number is: "+secondLargest);

        sc.close();

    }
}
