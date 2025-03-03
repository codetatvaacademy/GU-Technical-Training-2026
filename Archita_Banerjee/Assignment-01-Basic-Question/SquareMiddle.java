import java.util.Scanner;
public class SquareMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int mid = (num / 10) % 10;

        int sq = mid * mid;
        System.out.println("Square of the middle digit: " + sq);
    }
}
