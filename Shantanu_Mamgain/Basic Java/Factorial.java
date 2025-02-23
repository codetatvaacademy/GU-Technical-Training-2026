import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        int factorial=1;

        for(int i=0; i<number; i++){
            factorial *= number-i;
        }

        System.out.println("Factorial of the number is : "+factorial);

        sc.close();
    }
}
