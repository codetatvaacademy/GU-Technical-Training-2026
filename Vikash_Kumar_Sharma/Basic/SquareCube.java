import java.util.Scanner;
public class SquareCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int square = num * num;
		int cube = num * num * num;
		System.out.println("Your number " + num + " is square :" + square + " & " + "cube is :" + cube);
	}
}