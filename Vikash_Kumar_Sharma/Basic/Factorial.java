import java.util.Scanner;
public class Factorial {
	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for factorial:");
		int n = sc.nextInt();
		System.out.println("Factorial of Number =" + fact(n));
	}
}