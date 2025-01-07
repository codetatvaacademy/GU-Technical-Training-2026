import java.util.Scanner;
public class Week {
public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter your choice b/w 1 to 6:");
	int choice=sn.nextInt();
	switch(choice)
	{
	case 1: 
		System.out.println("Your choice Monday");
		break;
	case 2:
		System.out.println("Your choice Tuesday");
		break;
	case 3:
		System.out.println("Your choice Wednesday");
		break;
	case 4:
		System.out.println("Your choice Thirsday");
		break;
	case 5:
		System.out.println("Your choice Friday");
		break;
	case 6:
		System.out.println("Your choice Saturday");
		default:
			System.out.println("Your choice Sunday");
	}
}
}

