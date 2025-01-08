import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner vraj = new Scanner(System.in);
		System.out.println("Enter the starting Number:");
		int n1 = vraj.nextInt();
		System.out.println("Enter the ending Number:");
		int n2 = vraj.nextInt(), i, j;
		System.out.print("Prime Number =");
		for (i = n1; i <= n2; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j == i)
				System.out.print(j + " ");
		}
	}

}