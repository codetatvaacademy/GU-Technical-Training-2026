import java.util.Scanner;

public class Problem12 {
    //WAP to take input 2 numbers from the user and print their difference.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        int difference= num1-num2;
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        
    }

    
}
