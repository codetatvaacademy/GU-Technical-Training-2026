import java.util.Scanner;

public class Problem28 {
    //WAP to input a number from user and print its factorial.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        long factorial=1;

        //Check if number is negative
        if(num<0){
            System.out.println("Factorial is not defined for negtaive numbers.");

        }else{
            for(int i=1;i<=num;i++){
                factorial *= i ;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
        
    }
    
}
