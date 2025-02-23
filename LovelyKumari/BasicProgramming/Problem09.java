import java.util.Scanner;

public class Problem09 {
    //WAP to check whether a number is even or odd.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        //Check if even or odd 
        if(num % 2 == 0 ){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is a odd number.");
        }

        
    }

    
}
