import java.util.Scanner;

public class Circle {
	 static float pie=3.14f;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		float radius = sn.nextFloat();
		//int radius = sn.nextInt();
		float area =(pie*radius*radius);
		float cicumference=(2*pie*radius);
		System.out.println("Area of circle is :"+area);
		System.out.println("Cicumference of cicle is:"+cicumference);
	}
}