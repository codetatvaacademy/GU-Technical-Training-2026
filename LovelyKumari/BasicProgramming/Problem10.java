import java.util.Scanner;

public class Problem10 {
    // WAP to check whether the number is positive, negative or zero
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt() ;

        if(num > 0){
            System.out.println(num + " is a positive number.");
        } else if(num < 0){
            System.out.println( num + num + " is a negative number.");
        } else {
            System.out.println("Number is zero ");
        }
        
    }

    
}
