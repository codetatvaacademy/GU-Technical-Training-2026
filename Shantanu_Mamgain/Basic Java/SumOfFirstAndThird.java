import java.util.*;

public class SumOfFirstAndThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a three digit number: ");
        int number = sc.nextInt();

        int thirdDigit = number%10;
        int firstDigit = number/100;

        int sumOfFirstAndThird = thirdDigit+firstDigit;
        System.out.println("sum of first and third number of "+number+" is: "+sumOfFirstAndThird);

        sc.close();
    }
}