import java.util.Scanner;

public class Problem31 {
    //WAP to check whether a number is perfect or not.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum=0;

        for(int i=1;i<=num/2 ;i++){
            if(num%i==0) sum += i;
        }
        System.out.println(num + (sum == num && num > 0 ? " is a perfect number." : " is not a perfect number."));
    }
    
}
