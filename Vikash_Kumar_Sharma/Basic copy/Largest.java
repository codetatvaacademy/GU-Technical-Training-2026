import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sn.nextInt();
	System.out.println("Enter Second number");
	int b=sn.nextInt();
	System.out.println("Enter third number");
	int c=sn.nextInt();
	int max=0;
	if(a>b && a>c)
	{
		max+=a;
		//System.out.println("First is maximum number :"+a);
	}
	else if(b>a && b>c)
	{
		System.out.println("Second is maximum number :"+b);
	}
	else
		System.out.println("Third is maximum number :"+c);
//System.out.println("maximum :"+max);	
}
}

