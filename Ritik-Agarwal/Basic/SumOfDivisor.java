import java.util.Scanner;
public class SumOfDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int div=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                div+=i;
            }
        }
        System.out.println("Sum of divisors of " + n + " is: " + div);
    }
}