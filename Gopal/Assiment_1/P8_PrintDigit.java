import java.util.Scanner;

public class P8_PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        // Print num
        while (num != 0 ) {
            int rem = num % 10 ;
            System.out.print(rem + " ");
            num = num/10;
        }
    }
}
