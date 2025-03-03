import java.util.Scanner;

public class P32_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Reverse number :: ");
        while ( num != 0 ) {
            System.out.print(num%10 + " ");
            num /= 10 ;
        }
    }
}
