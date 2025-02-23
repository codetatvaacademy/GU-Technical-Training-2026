import java.util.Scanner;

public class Problem13 {
    // WAP to take input 3 numbers from the user and print the largest number among them.[Using nested if and using AND operator]
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3=sc.nextInt();

        // Check for the largest number using nested if and AND operator
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1 + " is the largest.");
            } else {
                System.out.println(num3+ " is the largest.");
            }
        } else if(num2>=num3){
            System.out.println(num2 + " is the largest.");
        } else {
            System.out.println(num3 + " is the largest.");
        }



    }


    
}
