import java.util.Scanner;

public class SumOfDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum=0;

        for(int range=1; range<=num; range++ ){
            if(num%range==0){
                sum += range;
            }
        }

        System.out.println("Sum of all divisors of "+num+" is: "+sum);
        sc.close();
    }
}
