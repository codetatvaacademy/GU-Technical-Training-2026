import java.util.Scanner;

public class Problem11 {
    //WAP to take input two numbers from the user and print the largest of them
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        //Comparison 
        if(num1>num2){
            System.out.println(num1 + " is the largest number.");

        } else if( num2>num1 ){
            System.out.println(num2 + " is largest number.");
        } else {
            System.out.println(" Equal numbers.");
        }
        
    }
    
}
