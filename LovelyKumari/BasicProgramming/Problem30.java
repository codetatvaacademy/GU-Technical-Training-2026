import java.util.Scanner;

public class Problem30 {
    //WAP to print the sum of the divisors of a number given by user.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum=0;

        //Find divisors and calculate sum
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        System.out.println("The sum of the divisors of "+num + " is: " + sum);
        
    }
    
}
