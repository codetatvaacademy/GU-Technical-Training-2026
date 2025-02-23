import java.util.*;

public class SquareOfMiddleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int number = sc.nextInt();

        int middleDigit = (number/10)%10;
        double squareOfMiddle = middleDigit*middleDigit;

        System.out.println("Square of middle digit is: "+squareOfMiddle);

        sc.close();
    }
}
