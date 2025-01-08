import java.util.Scanner;
public class NumReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age for voting :");
		int personAge=sc.nextInt();
		for(int i=1;i<=3;i++) {
		if(personAge>=18)
		{
			System.out.println("person are eligible for voting :"+personAge);	
		}
		else
		{
			System.out.println("person are not eligible for voting :"+personAge);
		}
		}
	}
}
