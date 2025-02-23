import java.util.Scanner;
public class SquareOfMiddleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int digit = sc.nextInt();
        sc.close();
        int temp = digit;
        int square = 0;
        for(int i=0; i<2; i++){
            if(i==1){
                int rem = temp%10;
                square = rem*rem;
            }
            temp /= 10;
        }
        System.out.println("Square of middle digit of " + digit + " is: " + square);
    }
}