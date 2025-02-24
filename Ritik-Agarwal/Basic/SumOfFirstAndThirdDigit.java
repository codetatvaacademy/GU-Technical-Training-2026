import java.util.Scanner;
public class SumOfFirstAndThirdDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int digit = sc.nextInt();
        sc.close();
        int temp = digit;
        int sum = 0;
        for(int i=0; i<3; i++){
            if(i==1){
                temp /= 10;
                continue;
            }
            int rem = temp%10;
            sum += rem;
            temp /= 10;
        }
        System.out.println("Sum of first and third digit of " + digit + " is: " + sum);
    }
}