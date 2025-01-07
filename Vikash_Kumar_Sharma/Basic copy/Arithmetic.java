import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	boolean notExit = true ;
	while(notExit)
	{
	System.out.println("Enter first number :");
	int n1 = sn.nextInt();
	System.out.println("Enter Second number :");
	int n2 = sn.nextInt();
	int a=n1+n2;
	int b=n1-n2;
	int c=n1*n2;
	int d=n1/n2;
	System.out.println("Enter your choice :n1.addition\n2.subtraction\n3.multiplication\n4.division\0.exit");
	int choice=sn.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Addition :"+a);
		break;
	case 2:
		System.out.println("subtraction :"+b);
		break;
	case 3:
		System.out.println("Multiplication :"+c);
		break;
	case 4:
		try {
			System.out.println("Division :+d");
			
			}
			catch(ArithmeticException e) 
			{
				System.out.println("denominator value can't be zero");
			}
			break;
	case 5:
		System.out.println("Thanks,visit again");
		notExit=false;
		default:
			break;
		}
	}
}
}
