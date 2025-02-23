import java.util.Scanner;

public class palindrome_number {
    public static void palindrome(int num) {
        int original_number = num;
        int rev = 0;
        while (num != 0) {
            int re = num % 10;
            rev = rev * 10 + re;
            num = num / 10;
        }
        System.out.println(rev);
        if (rev == original_number) {
            System.out.println("This is a palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindrome(num);
    }
}
